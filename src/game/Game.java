package game;

import entes.Jugador;
import graficos.Pantalla;
import graficos.Sprite;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import mapas.Mapa;
import mapas.MapaAleatorio;
import mapas.MapaCargado;

import controles.Teclado;

public class Game extends Canvas implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	private static final String NOMBRE="Juego";
	private static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	private static long referenciaContador=System.nanoTime();
	private static int aps=0;
	private static int fps=0;
	
	private static volatile boolean Corriendo=false;
	private static JFrame ventana;
	private static Thread thread1;
	private static Teclado teclado;
	private static Pantalla pantalla;
	private static Mapa mapa;
	private static Jugador jugador;
	
	private static BufferedImage imagen=new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
	private static int[] pixeles=((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
	private static final ImageIcon icono= new ImageIcon(Game.class.getResource("/Iconos/Game.png"));
	
	
	private Game(){
		//mapa = new MapaAleatorio(30,30);
		mapa= new MapaCargado("/mapas/BitMap1.png");
		
		setPreferredSize(new Dimension(ANCHO,ALTO));
		
		pantalla = new Pantalla(ANCHO,ALTO);
		
		teclado=new Teclado();
		addKeyListener(teclado);
		
		jugador=new Jugador(mapa, teclado, Sprite.SARA_ARRIBA1,180,180);
		
		ventana = new JFrame(NOMBRE);
		ventana.setResizable(false);
		ventana.setIconImage(icono.getImage());
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//device.setFullScreenWindow(ventana);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.iniciar();
	}
	
	private synchronized void iniciar(){
		Corriendo=true;
		thread1 = new Thread(this, "Graficos");
		thread1.start();
	}
	
	private synchronized void detener(){
		Corriendo=false;
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void actualizar(){
		teclado.actualizar();
		
		jugador.actualizar();
		
		aps++;
		
	}
	
	private void mostrar(){
		BufferStrategy estrategia= getBufferStrategy();
		if(estrategia==null){
			createBufferStrategy(3);
			return;
		}
		
		// modo 0= mapa cargado
		// modo 1= mapa aleatorio
		int jugadorX=jugador.getX()-pantalla.getAncho()/2+jugador.getSprite().getAncho()/2;
		int jugadorY=jugador.getY()-pantalla.getAlto()/2+jugador.getSprite().getAlto()/2;
		mapa.mostrar(jugadorX, jugadorY, pantalla,0);
		jugador.mostrar(pantalla);
		
		System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
		
		Graphics g = estrategia.getDrawGraphics();
		
		g.drawImage(imagen,0,0,getWidth(),getHeight(),null);
		g.setColor(Color.WHITE);
		g.drawString("X: "+jugador.getX(), 10, 15);
		g.drawString("Y: "+jugador.getY(), 10, 30);
		g.dispose();
		
		estrategia.show();
		
		fps++;
	}

	public void run() {
		final int ns_X_segundo=1000000000;
		final byte aps_X_objetivo=60;
		final double ns_X_actualizacion=ns_X_segundo/aps_X_objetivo;
		
		long referenciaActualizacion=System.nanoTime(); 
		double tiempoTranscurrido;
		double delta=0;
		
		while(Corriendo){
			final long inicioBucle = System.nanoTime();
			tiempoTranscurrido=inicioBucle-referenciaActualizacion;
			referenciaActualizacion=inicioBucle;
			delta+= tiempoTranscurrido/ns_X_actualizacion;
			
			while (delta>=1){
				actualizar();
				delta--;
			}
			mostrar();
			
			if (System.nanoTime()-referenciaContador>ns_X_segundo){
				
				ventana.setTitle(NOMBRE+" || APS: "+aps+" || FPS: "+fps);
				aps=0;
				fps=0;
				referenciaContador=System.nanoTime();
			}
		}
	}
	
	
}










