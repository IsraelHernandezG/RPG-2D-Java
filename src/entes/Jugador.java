package entes;

import mapas.Mapa;
import graficos.Pantalla;
import graficos.Sprite;
import controles.Teclado;

public class Jugador extends Personaje{
	private Teclado teclado;
	private int animacion;
	
	public Jugador(Mapa mapa, Teclado teclado, Sprite sprite){
		this.mapa=mapa;
		this.teclado=teclado;
		this.sprite=sprite;
	}
	
	public Jugador(Mapa mapa, Teclado teclado, Sprite sprite, int posicionX, int posicionY){
		this.mapa=mapa;
		this.teclado=teclado;
		this.sprite=sprite;
		this.x=posicionX;
		this.y=posicionY;
	}
	
	public void actualizar(){
		int desplazamientoX=0;
		int desplazamientoY=0;
		
		if (animacion<32767){
			animacion++;
		}else{
			animacion=0;
		}
		
		if(teclado.arriba){
			desplazamientoY--;
		}
		if(teclado.abajo){
			desplazamientoY++;
		}
		if(teclado.derecha){
			desplazamientoX++;
		}
		if(teclado.izquierda){
			desplazamientoX--;
		}
		if(desplazamientoX!=0 || desplazamientoY!=0){
			
			mover(desplazamientoX,desplazamientoY);
			movimiento=true;
			
			
		}else{
			movimiento=false;
		}
		
		if(direccion=='N'){
			sprite=Sprite.SARA_ARRIBA1;
			if(movimiento){
				int mod = animacion%45;
				if (mod<=5){
					sprite=Sprite.SARA_ARRIBA2;
				}else if(mod>5 && mod <=10){
					sprite=Sprite.SARA_ARRIBA3;
				}else if(mod>10 && mod <=15){
					sprite=Sprite.SARA_ARRIBA4;
				}else if(mod>15 && mod <=20){
					sprite=Sprite.SARA_ARRIBA5;
				}else if(mod>20 && mod <=25){
					sprite=Sprite.SARA_ARRIBA6;
				}else if(mod>25 && mod <=30){
					sprite=Sprite.SARA_ARRIBA7;
				}else if(mod>30 && mod <=35){
					sprite=Sprite.SARA_ARRIBA8;
				}else{
					sprite=Sprite.SARA_ARRIBA9;
				}
			}
		}
		
		
		if(direccion=='S'){
			sprite=Sprite.SARA_ABAJO1;
			if(movimiento){
				int mod = animacion%40;
				if (mod<=5){
					sprite=Sprite.SARA_ABAJO2;
				}else if(mod>5 && mod <=10){
					sprite=Sprite.SARA_ABAJO3;
				}else if(mod>10 && mod <=15){
					sprite=Sprite.SARA_ABAJO4;
				}else if(mod>15 && mod <=20){
					sprite=Sprite.SARA_ABAJO5;
				}else if(mod>20 && mod <=25){
					sprite=Sprite.SARA_ABAJO6;
				}else if(mod>25 && mod <=30){
					sprite=Sprite.SARA_ABAJO7;
				}else if(mod>30 && mod <=35){
					sprite=Sprite.SARA_ABAJO8;
				}else{
					sprite=Sprite.SARA_ABAJO9;
				}
			}
			
		}
		if(direccion=='E'){
			sprite=Sprite.SARA_DERECHA1;
			if(movimiento){
				int mod = animacion%40;
				if (mod<=5){
					sprite=Sprite.SARA_DERECHA2;
				}else if(mod>5 && mod <=10){
					sprite=Sprite.SARA_DERECHA3;
				}else if(mod>10 && mod <=15){
					sprite=Sprite.SARA_DERECHA4;
				}else if(mod>15 && mod <=20){
					sprite=Sprite.SARA_DERECHA5;
				}else if(mod>20 && mod <=25){
					sprite=Sprite.SARA_DERECHA6;
				}else if(mod>25 && mod <=30){
					sprite=Sprite.SARA_DERECHA7;
				}else if(mod>30 && mod <=35){
					sprite=Sprite.SARA_DERECHA8;
				}else{
					sprite=Sprite.SARA_DERECHA9;
				}
			}
		}
		if(direccion=='W'){
			sprite=Sprite.SARA_IZQUIERDA1;
			if(movimiento){
				int mod = animacion%40;
				if (mod<=5){
					sprite=Sprite.SARA_IZQUIERDA2;
				}else if(mod>5 && mod <=10){
					sprite=Sprite.SARA_IZQUIERDA3;
				}else if(mod>10 && mod <=15){
					sprite=Sprite.SARA_IZQUIERDA4;
				}else if(mod>15 && mod <=20){
					sprite=Sprite.SARA_IZQUIERDA5;
				}else if(mod>20 && mod <=25){
					sprite=Sprite.SARA_IZQUIERDA6;
				}else if(mod>25 && mod <=30){
					sprite=Sprite.SARA_IZQUIERDA7;
				}else if(mod>30 && mod <=35){
					sprite=Sprite.SARA_IZQUIERDA8;
				}else{
					sprite=Sprite.SARA_IZQUIERDA9;
				}
			}
		}
	}
	
	public void mostrar(Pantalla pantalla){
		pantalla.mostrarJugador(x, y, this);
	}
	
}
