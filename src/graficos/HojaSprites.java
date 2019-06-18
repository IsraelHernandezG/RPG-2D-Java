package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {
	private final int ancho;
	private final int alto;
	public final int[] pixeles;
	
	/**/
	public static HojaSprites MAPA_PUEBLO_INICIO=new HojaSprites("/texturas/HojaSpritePueblo.png", 640,640);
	public static HojaSprites SARA=new HojaSprites("/Jugador/pruebaSara.png", 300,300);
	/**/
	
	public HojaSprites(final String ruta, final int ancho, final int alto){
		this.ancho=ancho;
		this.alto=alto;
		pixeles=new int[ancho*alto];
		
		BufferedImage imagen;
		try {
			imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public int getAncho() {
		return ancho;
	}
}
