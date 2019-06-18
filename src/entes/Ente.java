package entes;

import mapas.Mapa;

public abstract class Ente {
	protected int x;
	protected int y;
	private boolean eliminado=false;
	
	public void actualizar(){
		
	}
	
	public void mostrar(){
		
	}
	
	public void eliminar(){
		eliminado=true;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int desplazamientoX) {
		this.x +=desplazamientoX;
	}
	public int getY() {
		return y;
	}
	public void setY(int desplazamientoY) {
		this.y +=desplazamientoY;
	}
	
	public boolean getEliminado(){
		return eliminado;
	}
	
	
	
	
}
