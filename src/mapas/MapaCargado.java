package mapas;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapas.tiles.Tile;

public class MapaCargado extends Mapa{

	private int[] pixeles;
	
	public MapaCargado(String ruta) {
		super(ruta);
	}
	
	protected void cargarMapa(String ruta) {
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
			ancho=imagen.getWidth();
			alto=imagen.getHeight();
			
			tileCatalogo=new Tile[alto*getAncho()];
			pixeles=new int [getAncho()*alto];
			
			imagen.getRGB(0, 0,getAncho(),alto,pixeles,0,getAncho());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void generarMapa(){
		for (int i=0; i<pixeles.length;i++){
			switch(pixeles[i]){
			case 0xff003605:
				tileCatalogo[i]=Tile.PASTO0;
				continue;
			case 0xff003705:
				tileCatalogo[i]=Tile.PASTO1;
				continue;
			case 0xff003805:
				tileCatalogo[i]=Tile.PASTO2;
				continue;
			case 0xff003905:
				tileCatalogo[i]=Tile.PASTO3;
				continue;
			case 0xff003a05:
				tileCatalogo[i]=Tile.PASTO_FLORES0;
				continue;
			case 0xff003b05:
				tileCatalogo[i]=Tile.PASTO_FLORES1;
				continue;
			case 0xff003c05:
				tileCatalogo[i]=Tile.PASTO_FLORES2;
				continue;	
			case 0xff911200:
				tileCatalogo[i]=Tile.LADO_IZQ_TECHO1;
				continue;
			case 0xff911300:
				tileCatalogo[i]=Tile.LADO_IZQ_TECHO2;
				continue;
			case 0xff911400:
				tileCatalogo[i]=Tile.LADO_IZQ_TECHO3;
				continue;
			case 0xff911500:
				tileCatalogo[i]=Tile.LADO_IZQ_TECHO4;
				continue;
			case 0xff911600:
				tileCatalogo[i]=Tile.LADO_IZQ_TECHO5;
				continue;
			case 0xff911700:
				tileCatalogo[i]=Tile.TECHO;
				continue;
			case 0xff912000:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO1;
				continue;
			case 0xff912100:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO2;
				continue;
			case 0xff912200:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO3;
				continue;
			case 0xff912300:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO4;
				continue;
			case 0xff912400:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO5;
				continue;
			case 0xff912500:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO6;
				continue;
			case 0xff912600:
				tileCatalogo[i]=Tile.ESQ_IZQ_TECHO7;
				continue;
			case 0xff912700:
				tileCatalogo[i]=Tile.CENTRO_TECHO1;
				continue;
			case 0xff912800:
				tileCatalogo[i]=Tile.CENTRO_TECHO2;
				continue;
			case 0xff912900:
				tileCatalogo[i]=Tile.CENTRO_TECHO3;
				continue;
			case 0xff912a00:
				tileCatalogo[i]=Tile.CENTRO_TECHO4;
				continue;
			case 0xff912b00:
				tileCatalogo[i]=Tile.CENTRO_TECHO5;
				continue;
			case 0xff912c00:
				tileCatalogo[i]=Tile.CENTRO_TECHO6;
				continue;
			case 0xff912e00:
				tileCatalogo[i]=Tile.PUNTA_CHIM1;
				continue;
			case 0xff912f00:
				tileCatalogo[i]=Tile.PUNTA_CHIM2;
				continue;
			case 0xff913000:
				tileCatalogo[i]=Tile.PUNTA_CHIM3;
				continue;
			case 0xff913100:
				tileCatalogo[i]=Tile.PUNTA_CHIM4;
				continue;
			case 0xff913200:
				tileCatalogo[i]=Tile.PUNTA_CHIM5;
				continue;
			case 0xff913300:
				tileCatalogo[i]=Tile.PUNTA_CHIM6;
				continue;
			case 0xff913400:
				tileCatalogo[i]=Tile.BASE_CHIM;
				continue;
			case 0xff913500:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO1;
				continue;
			case 0xff913600:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO2;
				continue;
			case 0xff913700:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO3;
				continue;
			case 0xff913800:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO4;
				continue;
			case 0xff913900:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO5;
				continue;
			case 0xff913a00:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO6;
				continue;
			case 0xff913b00:
				tileCatalogo[i]=Tile.ESQ_DER_TECHO7;
				continue;
			case 0xff913c00:
				tileCatalogo[i]=Tile.LADO_DER_TECHO1;
				continue;
			case 0xff913d00:
				tileCatalogo[i]=Tile.LADO_DER_TECHO2;
				continue;
			case 0xff913e00:
				tileCatalogo[i]=Tile.LADO_DER_TECHO3;
				continue;
			case 0xff913f00:
				tileCatalogo[i]=Tile.LADO_DER_TECHO4;
				continue;
			case 0xff914000:
				tileCatalogo[i]=Tile.LADO_DER_TECHO5;
				continue;
			case 0xff9d6600:
				tileCatalogo[i]=Tile.MADERA1;
				continue;
			case 0xff9d6700:
				tileCatalogo[i]=Tile.MADERA2;
				continue;
			case 0xff9d6800:
				tileCatalogo[i]=Tile.MADERA3;
				continue;
			case 0xff9d6900:
				tileCatalogo[i]=Tile.MADERA4;
				continue;
			case 0xff9d6a00:
				tileCatalogo[i]=Tile.MADERA5;
				continue;
			case 0xff9d6b00:
				tileCatalogo[i]=Tile.MADERA6;
				continue;
			case 0xff9d6c00:
				tileCatalogo[i]=Tile.MADERA7;
				continue;
			case 0xff9d6d00:
				tileCatalogo[i]=Tile.MADERA_ORILLA_IZQ;
				continue;
			case 0xff9d6e00:
				tileCatalogo[i]=Tile.MADERA_ORILLA_DER;
				continue;
			case 0xff9d6f00:
				tileCatalogo[i]=Tile.MADERA_ORILLA_DER_CONT;
				continue;
			case 0xff9d7000:
				tileCatalogo[i]=Tile.MADERA_TEJAS_ORILLA_IZQ;
				continue;
			case 0xff9d7100:
				tileCatalogo[i]=Tile.MADERA_TEJAS_ORILLA_DER;
				continue;
			case 0xff9d7200:
				tileCatalogo[i]=Tile.MADERA_TEJAS1;
				continue;
			case 0xff9d7300:
				tileCatalogo[i]=Tile.MADERA_TEJAS2;
				continue;
			case 0xff9d7400:
				tileCatalogo[i]=Tile.MADERA_TEJAS3;
				continue;
			case 0xff9d7500:
				tileCatalogo[i]=Tile.MADERA_TEJAS4;
				continue;
			case 0xff9d7600:
				tileCatalogo[i]=Tile.MADERA_TEJAS5;
				continue;
			case 0xff9d7700:
				tileCatalogo[i]=Tile.MADERA_TEJAS6;
				continue;
			case 0xff9d7800:
				tileCatalogo[i]=Tile.MADERA_TEJAS7;
				continue;
			case 0xff9d7900:
				tileCatalogo[i]=Tile.MADERA_TEJAS8;
				continue;
			case 0xff9d7a00:
				tileCatalogo[i]=Tile.MADERA_PASTO_ORILLA_IZQ;
				continue;
			case 0xff9d7b00:
				tileCatalogo[i]=Tile.MADERA_PASTO_ORILLA_DER;
				continue;
			case 0xff9d7c00:
				tileCatalogo[i]=Tile.MADERA_PASTO1;
				continue;
			case 0xff9d7d00:
				tileCatalogo[i]=Tile.MADERA_PASTO2;
				continue;
			case 0xff9d7e00:
				tileCatalogo[i]=Tile.MADERA_PASTO3;
				continue;
			case 0xff9d7f00:
				tileCatalogo[i]=Tile.MADERA_PASTO4;
				continue;
			case 0xff9d8000:
				tileCatalogo[i]=Tile.MADERA_PASTO5;
				continue;
			case 0xff9d8100:
				tileCatalogo[i]=Tile.MADERA_PASTO6;
				continue;
			case 0xff9d8200:
				tileCatalogo[i]=Tile.TOP_PUERTA1;
				continue;
			case 0xff9d8300:
				tileCatalogo[i]=Tile.TOP_PUERTA2;
				continue;
			case 0xff9d8400:
				tileCatalogo[i]=Tile.BASE_PUERTA;
				continue;
			case 0xff2f8100:
				tileCatalogo[i]=Tile.ARBOL_0X0_1;
				continue;
			case 0xff2f8200:
				tileCatalogo[i]=Tile.ARBOL_0X0_2;
				continue;
			case 0xff2f8300:
				tileCatalogo[i]=Tile.ARBOL_0X0_3;
				continue;
			case 0xff2f8400:
				tileCatalogo[i]=Tile.ARBOL_0X0_4;
				continue;
			case 0xff2f8500:
				tileCatalogo[i]=Tile.ARBOL_0X0_5;
				continue;
			case 0xff2f8600:
				tileCatalogo[i]=Tile.ARBOL_0X0_6;
				continue;
			case 0xff2f8700:
				tileCatalogo[i]=Tile.ARBOL_0X0_7;
				continue;
			case 0xff2f8800:
				tileCatalogo[i]=Tile.ARBOL_2X0_1;
				continue;
			case 0xff2f8900:
				tileCatalogo[i]=Tile.ARBOL_2X0_2;
				continue;
			case 0xff2f8a00:
				tileCatalogo[i]=Tile.ARBOL_2X0_3;
				continue;
			case 0xff2f8b00:
				tileCatalogo[i]=Tile.ARBOL_2X0_4;
				continue;
			case 0xff2f8c00:
				tileCatalogo[i]=Tile.ARBOL_2X0_5;
				continue;
			case 0xff2f8d00:
				tileCatalogo[i]=Tile.ARBOL_2X0_6;
				continue;
			case 0xff2f8e00:
				tileCatalogo[i]=Tile.ARBOL_2X0_7;
				continue;
			case 0xff2f8f00:
				tileCatalogo[i]=Tile.ARBOL_0X1_1;
				continue;	
			case 0xff2f9000:
				tileCatalogo[i]=Tile.ARBOL_0X1_2;
				continue;
			case 0xff2f9100:
				tileCatalogo[i]=Tile.ARBOL_2X1_1;
				continue;
			case 0xff2f9200:
				tileCatalogo[i]=Tile.ARBOL_1X0_1;
				continue;
			case 0xff2f9300:
				tileCatalogo[i]=Tile.ARBOL_1X1_1;
				continue;
			case 0xff2f9400:
				tileCatalogo[i]=Tile.ARBOL_0X2_1;
				continue;
			case 0xff2f9500:
				tileCatalogo[i]=Tile.ARBOL_0X2_2;
				continue;
			case 0xff2f9600:
				tileCatalogo[i]=Tile.ARBOL_0X2_3;
				continue;
			case 0xff2f9700:
				tileCatalogo[i]=Tile.ARBOL_0X2_4;
				continue;
			case 0xff2f9800:
				tileCatalogo[i]=Tile.ARBOL_0X2_5;
				continue;
			case 0xff2f9900:
				tileCatalogo[i]=Tile.ARBOL_0X2_6;
				continue;
			case 0xff2f9a00:
				tileCatalogo[i]=Tile.ARBOL_0X2_7;
				continue;
			case 0xff2f9b00:
				tileCatalogo[i]=Tile.ARBOL_1X2_1;
				continue;
			case 0xff2f9c00:
				tileCatalogo[i]=Tile.ARBOL_1X2_2;
				continue;
			case 0xff2f9d00:
				tileCatalogo[i]=Tile.ARBOL_1X2_3;
				continue;
			case 0xff2f9e00:
				tileCatalogo[i]=Tile.ARBOL_1X2_4;
				continue;
			case 0xff2f9f00:
				tileCatalogo[i]=Tile.ARBOL_1X2_5;
				continue;
			case 0xff2fa000:
				tileCatalogo[i]=Tile.ARBOL_2X2_1;
				continue;
			case 0xff2fa100:
				tileCatalogo[i]=Tile.ARBOL_2X2_2;
				continue;
			case 0xff2fa200:
				tileCatalogo[i]=Tile.ARBOL_2X2_3;
				continue;
			case 0xff2fa300:
				tileCatalogo[i]=Tile.ARBOL_2X2_4;
				continue;
			case 0xff2fa400:
				tileCatalogo[i]=Tile.ARBOL_2X2_5;
				continue;
			case 0xff2fa500:
				tileCatalogo[i]=Tile.ARBOL_2X2_6;
				continue;
			case 0xff2fa600:
				tileCatalogo[i]=Tile.ARBOL_2X2_7;
				continue;
			case 0xff2fa700:
				tileCatalogo[i]=Tile.ARBOL_0X3_1;
				continue;
			case 0xff2fa800:
				tileCatalogo[i]=Tile.ARBOL_0X3_2;
				continue;
			case 0xff2fa900:
				tileCatalogo[i]=Tile.ARBOL_0X3_3;
				continue;
			case 0xff2faa00:
				tileCatalogo[i]=Tile.ARBOL_0X3_4;
				continue;
			case 0xff2fab00:
				tileCatalogo[i]=Tile.ARBOL_0X3_5;
				continue;
			case 0xff2fac00:
				tileCatalogo[i]=Tile.ARBOL_0X3_6;
				continue;
			case 0xff2fad00:
				tileCatalogo[i]=Tile.ARBOL_0X3_7;
				continue;
			case 0xff2fae00:
				tileCatalogo[i]=Tile.ARBOL_1X3_1;
				continue;
			case 0xff2faf00:
				tileCatalogo[i]=Tile.ARBOL_1X3_2;
				continue;
			case 0xff2fb000:
				tileCatalogo[i]=Tile.ARBOL_1X3_3;
				continue;
			case 0xff2fb100:
				tileCatalogo[i]=Tile.ARBOL_1X3_4;
				continue;
			case 0xff2fb200:
				tileCatalogo[i]=Tile.ARBOL_1X3_5;
				continue;
			case 0xff2fb300:
				tileCatalogo[i]=Tile.ARBOL_2X3_1;
				continue;
			case 0xff2fb400:
				tileCatalogo[i]=Tile.ARBOL_2X3_2;
				continue;
			case 0xff2fb500:
				tileCatalogo[i]=Tile.ARBOL_2X3_3;
				continue;
			case 0xff2fb600:
				tileCatalogo[i]=Tile.ARBOL_2X3_4;
				continue;
			case 0xff2fb700:
				tileCatalogo[i]=Tile.ARBOL_2X3_5;
				continue;
			case 0xff2fb800:
				tileCatalogo[i]=Tile.ARBOL_2X3_6;
				continue;
			case 0xff2fb900:
				tileCatalogo[i]=Tile.ARBOL_2X3_7;
				continue;
			case 0xff2fba00:
				tileCatalogo[i]=Tile.ARBOL_0X4_1;
				continue;
			case 0xff2fbb00:
				tileCatalogo[i]=Tile.ARBOL_0X4_2;
				continue;
			case 0xff2fbc00:
				tileCatalogo[i]=Tile.ARBOL_0X4_3;
				continue;
			case 0xff2fbd00:
				tileCatalogo[i]=Tile.ARBOL_0X4_4;
				continue;
			case 0xff2fbe00:
				tileCatalogo[i]=Tile.ARBOL_0X4_5;
				continue;
			case 0xff2fbf00:
				tileCatalogo[i]=Tile.ARBOL_0X4_6;
				continue;
			case 0xff2fc000:
				tileCatalogo[i]=Tile.ARBOL_0X4_7;
				continue;
			case 0xff2fc100:
				tileCatalogo[i]=Tile.ARBOL_1X4_1;
				continue;
			case 0xff2fc200:
				tileCatalogo[i]=Tile.ARBOL_1X4_2;
				continue;
			case 0xff2fc300:
				tileCatalogo[i]=Tile.ARBOL_1X4_3;
				continue;
			case 0xff2fc400:
				tileCatalogo[i]=Tile.ARBOL_1X4_4;
				continue;
			case 0xff2fc500:
				tileCatalogo[i]=Tile.ARBOL_1X4_5;
				continue;
			case 0xff2fc600:
				tileCatalogo[i]=Tile.ARBOL_1X4_6;
				continue;
			case 0xff2fc700:
				tileCatalogo[i]=Tile.ARBOL_1X4_7;
				continue;
			case 0xff2fc800:
				tileCatalogo[i]=Tile.ARBOL_2X4_1;
				continue;
			case 0xff2fc900:
				tileCatalogo[i]=Tile.ARBOL_2X4_2;
				continue;
			case 0xff2fca00:
				tileCatalogo[i]=Tile.ARBOL_2X4_3;
				continue;
			case 0xff2fcb00:
				tileCatalogo[i]=Tile.ARBOL_2X4_4;
				continue;
			case 0xff2fcc00:
				tileCatalogo[i]=Tile.ARBOL_2X4_5;
				continue;
			case 0xff2fcd00:
				tileCatalogo[i]=Tile.ARBOL_2X4_6;
				continue;
			case 0xff2fce00:
				tileCatalogo[i]=Tile.ARBOL_2X4_7;
				continue;
			case 0xff2fcf00:
				tileCatalogo[i]=Tile.TOCON;
				continue;
			case 0xff5a3400:
				tileCatalogo[i]=Tile.SENDERO_IZ;
				continue;
			case 0xff5a3500:
				tileCatalogo[i]=Tile.SENDERO_DER;
				continue;
			case 0xff5a3600:
				tileCatalogo[i]=Tile.SENDERO_UP1;
				continue;
			case 0xff5a3700:
				tileCatalogo[i]=Tile.SENDERO_UP2;
				continue;
			case 0xff5a3800:
				tileCatalogo[i]=Tile.SENDERO_DOWN1;
				continue;
			case 0xff5a3900:
				tileCatalogo[i]=Tile.SENDERO_DOWN2;
				continue;
			case 0xff5a3a00:
				tileCatalogo[i]=Tile.SENDERO_ESQUINA1;
				continue;
			case 0xff5a3b00:
				tileCatalogo[i]=Tile.SENDERO_ESQUINA2;
				continue;
			case 0xff5a3c00:
				tileCatalogo[i]=Tile.SENDERO_ESQUINA3;
				continue;
			case 0xff5a3d00:
				tileCatalogo[i]=Tile.SENDERO_ESQUINA4;
				continue;
			case 0xff885c00:
				tileCatalogo[i]=Tile.SENDERO_CENTRO1;
				continue;
			case 0xff885d00:
				tileCatalogo[i]=Tile.SENDERO_CENTRO2;
				continue;
			case 0xff885e00:
				tileCatalogo[i]=Tile.SENDERO_CENTRO3;
				continue;
			case 0xff885f00:
				tileCatalogo[i]=Tile.SENDERO_CENTRO4;
				continue;
			default:
				tileCatalogo[i]=Tile.VACIO;
			}
		}
	}

}











