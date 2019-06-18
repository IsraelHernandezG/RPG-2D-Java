package entes;

import mapas.Mapa;
import graficos.Sprite;

public class Personaje extends Ente{
	protected Sprite sprite;
	protected char direccion='N';
	protected boolean movimiento=false;
	protected Mapa mapa;
	//protected boolean enColision=false;
	
	public void actualizar(){
		
	}
	
	public void mostrar(){
		
	}
	
	public void mover(int desplazamientoX,int desplazamientoY){
		if(desplazamientoX > 0){
			direccion='E';
		}
		if(desplazamientoX < 0){
			direccion='W';
		}
		if(desplazamientoY > 0){
			direccion='S';
		}
		if(desplazamientoY < 0){
			direccion='N';
		}
		if (!getEliminado()){
			if(!colision(desplazamientoX,0)){
				setX(desplazamientoX);
			}
			if(!colision(0,desplazamientoY)){
				setY(desplazamientoY);
			}
		}
	}
	
	private boolean colision(int desplazamientoX, int desplazamientoY){
		boolean enColision=false;
		
		int posicionX=x+desplazamientoX;
		int posicionY=y+desplazamientoY;
		
		int margenIzquierdo=-6;
		int margenSuperior=18;
		int margenDerecho=-4;
		int margenInferior=31;
		
		/*int bordeIzquierdo=(posicionX+margenDerecho)/sprite.getAncho();
		int bordeSuperior=(posicionY+margenInferior)/sprite.getAlto();
		int bordeDerecho=(posicionX+margenDerecho+margenIzquierdo)/sprite.getAncho();
		int bordeInferior=(posicionY+margenInferior+margenSuperior)/sprite.getAlto();
		
		if(mapa.getTileC(bordeIzquierdo+bordeSuperior*mapa.getAncho()).esSolido()){
			enColision=true;
		}
		if(mapa.getTileC(bordeIzquierdo+bordeInferior*mapa.getAncho()).esSolido()){
			enColision=true;
		}
		if(mapa.getTileC(bordeDerecho+bordeSuperior*mapa.getAncho()).esSolido()){
			enColision=true;
		}
		if(mapa.getTileC(bordeDerecho+bordeInferior*mapa.getAncho()).esSolido()){
			enColision=true;
		}*/
		
		//return enColision;
		return enColision;
	}
	
	public Sprite getSprite(){
		return sprite;
	}
	
	
}
