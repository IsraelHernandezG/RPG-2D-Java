package controles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener{
	private final static int numeroTeclas=120;
	private final boolean[] teclas=new boolean[numeroTeclas];
	
	public boolean arriba;
	public boolean abajo;
	public boolean derecha;
	public boolean izquierda;
	
	public void actualizar(){
		arriba=teclas[KeyEvent.VK_W];
		abajo=teclas[KeyEvent.VK_S];
		derecha=teclas[KeyEvent.VK_D];
		izquierda=teclas[KeyEvent.VK_A];
	}

	public void keyPressed(KeyEvent ke) {
		teclas[ke.getKeyCode()]=true;
	}

	public void keyReleased(KeyEvent ke) {
		teclas[ke.getKeyCode()]=false;
	}

	public void keyTyped(KeyEvent arg0) {
		
	}

}
