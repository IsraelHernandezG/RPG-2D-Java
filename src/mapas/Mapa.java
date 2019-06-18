package mapas;

import mapas.tiles.Tile;
import graficos.Pantalla;


public abstract class Mapa {
	
	protected int alto;
	protected int ancho;
	protected int[] tiles;
	protected Tile[] tileCatalogo;
	
	public Mapa(int ancho, int alto){
		this.alto=alto;
		this.ancho=ancho;
		tiles=new int[ancho*alto];
		generarMapa();
	}
	
	protected void generarMapa() {
		
	}

	public Mapa (String ruta){
		cargarMapa(ruta);
		generarMapa();
	}

	protected void cargarMapa(String ruta) {
		
	}
	
	public void actualizar(){
		
	}
	
	public void mostrar(final int compensacionX, final int compensacionY, final Pantalla pantalla, final int modo){
		pantalla.setDiferencia(compensacionX, compensacionY);
	
		int W =compensacionX>>5; // x/32
		int N =compensacionY>>5;
		int E =(compensacionX+pantalla.getAncho()+Tile.dimension)>>5;
		int S =(compensacionY+pantalla.getAlto()+Tile.dimension)>>5;
		
		for (int y = N; y < S ; y++ ){
			for (int x = W; x < E ; x++){
				if(x<0 || y<0 || x>= ancho || y>= alto){
					Tile.VACIO.mostrar(x, y, pantalla);
					
				}else{
					if (modo==0){
						tileCatalogo[x+y*ancho].mostrar(x, y, pantalla);
					}else{
						obtenTile(x,y).mostrar(x, y, pantalla);
					}
				
				}
				
			}
		}
	}
	
	public Tile obtenTile(final int x, final int y){
		switch(tiles[x+y*ancho]){
		case 0:
			return Tile.PASTO0;
		case 1:
			return Tile.PASTO1;
		case 2:
			return Tile.PASTO2;
		case 3:
			return Tile.PASTO3;
		case 4:
			return Tile.PASTO_FLORES0;
		case 5:
			return Tile.PASTO_FLORES1;
		case 6:
			return Tile.PASTO_FLORES2;	
			
		default:
			return Tile.VACIO;
		}
	}
	
	public Tile getTileC(int posicion){
		return tileCatalogo[posicion];
	}

	public int getAncho() {
		return ancho;
	}
	

}
















