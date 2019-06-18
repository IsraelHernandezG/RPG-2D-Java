package graficos;

import entes.Jugador;
import mapas.tiles.Tile;

public final class Pantalla {
	private final int ancho;
	private final int alto;
	public final int[] pixeles;
	
	private int diferenciaX;
	private int diferenciaY;
	
	public Pantalla(final int ancho, final int alto){
		this.ancho=ancho;
		this.alto=alto;
		pixeles=new int[ancho*alto];
	}
	
	public void limpiar(){
		for (int i=0; i<pixeles.length;i++){
			pixeles[i]=0;
		}
	}
	
	public void mostrarTile(int compensacionX, int compensacionY, Tile tile){
		compensacionX-=diferenciaX;
		compensacionY-=diferenciaY;
		
		for(int y=0; y<tile.sprite.getDimension(); y++){
			int posicionY=y+compensacionY;
			if(posicionY < -tile.sprite.getDimension() || posicionY >= getAlto()){
				break;
			}
			for(int x=0; x < tile.sprite.getDimension(); x++){
				int posicionX = x + compensacionX;
				if(posicionX < -tile.sprite.getDimension() || posicionX >= getAncho()){
					break;
				}
				if (posicionX<0){
					posicionX=0;
				}
				if (posicionY<0){
					posicionY=0;
				}
				pixeles[posicionX + posicionY * getAncho()]=tile.sprite.pixeles[x+y*tile.sprite.getDimension()];
			}
		}
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
	
	public void setDiferencia(final int diferenciaX,final int diferenciaY){
		this.diferenciaX=diferenciaX;
		this.diferenciaY=diferenciaY;
	}
	
	public void mostrarJugador(int compensacionX, int compensacionY, Jugador jugador){
		compensacionX-=diferenciaX;
		compensacionY-=diferenciaY;
		
		for(int y=0; y<jugador.getSprite().getAlto(); y++){
			int posicionY=y+compensacionY;
			if(posicionY < -jugador.getSprite().getAlto() || posicionY >= getAlto()){
				break;
			}
			for(int x=0; x < jugador.getSprite().getAncho(); x++){
				int posicionX = x + compensacionX;
				if(posicionX < -jugador.getSprite().getAncho() || posicionX >= getAncho()){
					break;
				}
				if (posicionX<0){
					posicionX=0;
				}
				if (posicionY<0){
					posicionY=0;
				}
				if (jugador.getSprite().pixeles[x+y*jugador.getSprite().getAncho()]!=0){
					pixeles[posicionX + posicionY * getAncho()]=jugador.getSprite().pixeles[x+y*jugador.getSprite().getAncho()];
				}
				
			
			}
		}
	}

}






























