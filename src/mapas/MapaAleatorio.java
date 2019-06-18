package mapas;

import java.util.Random;

public class MapaAleatorio extends Mapa{
	
	private static final Random aleatorio= new Random();

	public MapaAleatorio(int ancho, int alto) {
		super(ancho, alto);
	}

	protected void generarMapa(){
		for (int y=0;y<alto;y++){
			for(int x=0; x<getAncho();x++){
				tiles[x+y*getAncho()]=aleatorio.nextInt(5);
			}
		}
	}
}
