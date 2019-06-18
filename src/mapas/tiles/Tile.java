package mapas.tiles;

import graficos.HojaSprites;
import graficos.Pantalla;
import graficos.Sprite;

public abstract class Tile {
	public int alto;
	public int ancho;
	public Sprite sprite;
	public boolean solido;
	public static int dimension =32;
	
	/**/
	public static final Tile VACIO = new TileVacio(Sprite.VACIO);
	public static final Tile PASTO0= new TileFondo(Sprite.PASTO0);
	public static final Tile PASTO1= new TileFondo(Sprite.PASTO1);
	public static final Tile PASTO2= new TileFondo(Sprite.PASTO2);
	public static final Tile PASTO3= new TileFondo(Sprite.PASTO3);
	public static final Tile PASTO_FLORES0= new TileFondo(Sprite.PASTO_FLORES0);
	public static final Tile PASTO_FLORES1= new TileFondo(Sprite.PASTO_FLORES1);
	public static final Tile PASTO_FLORES2= new TileFondo(Sprite.PASTO_FLORES2);
	
	public static final Tile SENDERO_IZ = new TileFondo(Sprite.SENDERO_IZ);
	public static final Tile SENDERO_DER= new TileFondo(Sprite.SENDERO_DER);
	public static final Tile SENDERO_UP1= new TileFondo(Sprite.SENDERO_UP1);
	public static final Tile SENDERO_UP2= new TileFondo(Sprite.SENDERO_UP2);
	public static final Tile SENDERO_DOWN1= new TileFondo(Sprite.SENDERO_DOWN1);
	public static final Tile SENDERO_DOWN2= new TileFondo(Sprite.SENDERO_DOWN2);
	public static final Tile SENDERO_ESQUINA1= new TileFondo(Sprite.SENDERO_ESQUINA1);
	public static final Tile SENDERO_ESQUINA2= new TileFondo(Sprite.SENDERO_ESQUINA2);
	public static final Tile SENDERO_ESQUINA3= new TileFondo(Sprite.SENDERO_ESQUINA3);
	public static final Tile SENDERO_ESQUINA4= new TileFondo(Sprite.SENDERO_ESQUINA4);
	public static final Tile SENDERO_CENTRO1= new TileFondo(Sprite.SENDERO_CENTRO1);
	public static final Tile SENDERO_CENTRO2= new TileFondo(Sprite.SENDERO_CENTRO2);
	public static final Tile SENDERO_CENTRO3= new TileFondo(Sprite.SENDERO_CENTRO3);
	public static final Tile SENDERO_CENTRO4= new TileFondo(Sprite.SENDERO_CENTRO4);
	public static final Tile LADO_IZQ_TECHO1= new TileObstaculo(Sprite.LADO_IZQ_TECHO1,true);
	public static final Tile LADO_IZQ_TECHO2= new TileObstaculo(Sprite.LADO_IZQ_TECHO2,true);
	public static final Tile LADO_IZQ_TECHO3= new TileObstaculo(Sprite.LADO_IZQ_TECHO3,true);
	public static final Tile LADO_IZQ_TECHO4= new TileObstaculo(Sprite.LADO_IZQ_TECHO4,true);
	public static final Tile LADO_IZQ_TECHO5= new TileObstaculo(Sprite.LADO_IZQ_TECHO5,true);
	public static final Tile TECHO= new TileObstaculo(Sprite.TECHO,true);
	public static final Tile ESQ_IZQ_TECHO1= new TileObstaculo(Sprite.ESQ_IZQ_TECHO1,true);
	public static final Tile ESQ_IZQ_TECHO2= new TileObstaculo(Sprite.ESQ_IZQ_TECHO2,true);
	public static final Tile ESQ_IZQ_TECHO3= new TileObstaculo(Sprite.ESQ_IZQ_TECHO3,true);
	public static final Tile ESQ_IZQ_TECHO4= new TileObstaculo(Sprite.ESQ_IZQ_TECHO4,true);
	public static final Tile ESQ_IZQ_TECHO5= new TileObstaculo(Sprite.ESQ_IZQ_TECHO5,true);
	public static final Tile ESQ_IZQ_TECHO6= new TileObstaculo(Sprite.ESQ_IZQ_TECHO6,true);
	public static final Tile ESQ_IZQ_TECHO7= new TileObstaculo(Sprite.ESQ_IZQ_TECHO7,true);
	public static final Tile CENTRO_TECHO1= new TileObstaculo(Sprite.CENTRO_TECHO1,true);
	public static final Tile CENTRO_TECHO2= new TileObstaculo(Sprite.CENTRO_TECHO2,true);
	public static final Tile CENTRO_TECHO3= new TileObstaculo(Sprite.CENTRO_TECHO3,true);
	public static final Tile CENTRO_TECHO4= new TileObstaculo(Sprite.CENTRO_TECHO4,true);
	public static final Tile CENTRO_TECHO5= new TileObstaculo(Sprite.CENTRO_TECHO5,true);
	public static final Tile CENTRO_TECHO6= new TileObstaculo(Sprite.CENTRO_TECHO6,true);
	public static final Tile PUNTA_CHIM1= new TileObstaculo(Sprite.PUNTA_CHIM1,true);
	public static final Tile PUNTA_CHIM2= new TileObstaculo(Sprite.PUNTA_CHIM2,true);
	public static final Tile PUNTA_CHIM3= new TileObstaculo(Sprite.PUNTA_CHIM3,true);
	public static final Tile PUNTA_CHIM4= new TileObstaculo(Sprite.PUNTA_CHIM4,true);
	public static final Tile PUNTA_CHIM5= new TileObstaculo(Sprite.PUNTA_CHIM5,true);
	public static final Tile PUNTA_CHIM6= new TileObstaculo(Sprite.PUNTA_CHIM6,true);
	public static final Tile BASE_CHIM= new TileObstaculo(Sprite.BASE_CHIM,true);
	public static final Tile ESQ_DER_TECHO1= new TileObstaculo(Sprite.ESQ_DER_TECHO1,true);
	public static final Tile ESQ_DER_TECHO2= new TileObstaculo(Sprite.ESQ_DER_TECHO2,true);
	public static final Tile ESQ_DER_TECHO3= new TileObstaculo(Sprite.ESQ_DER_TECHO3,true);
	public static final Tile ESQ_DER_TECHO4= new TileObstaculo(Sprite.ESQ_DER_TECHO4,true);
	public static final Tile ESQ_DER_TECHO5= new TileObstaculo(Sprite.ESQ_DER_TECHO5,true);
	public static final Tile ESQ_DER_TECHO6= new TileObstaculo(Sprite.ESQ_DER_TECHO6,true);
	public static final Tile ESQ_DER_TECHO7= new TileObstaculo(Sprite.ESQ_DER_TECHO7,true);
	public static final Tile LADO_DER_TECHO1= new TileObstaculo(Sprite.LADO_DER_TECHO1,true);
	public static final Tile LADO_DER_TECHO2= new TileObstaculo(Sprite.LADO_DER_TECHO2,true);
	public static final Tile LADO_DER_TECHO3= new TileObstaculo(Sprite.LADO_DER_TECHO3,true);
	public static final Tile LADO_DER_TECHO4= new TileObstaculo(Sprite.LADO_DER_TECHO4,true);
	public static final Tile LADO_DER_TECHO5= new TileObstaculo(Sprite.LADO_DER_TECHO5,true);
	public static final Tile ARBOL_0X0_1= new TileFondo(Sprite.ARBOL_0X0_1);
	public static final Tile ARBOL_0X0_2= new TileFondo(Sprite.ARBOL_0X0_2);
	public static final Tile ARBOL_0X0_3= new TileFondo(Sprite.ARBOL_0X0_3);
	public static final Tile ARBOL_0X0_4= new TileFondo(Sprite.ARBOL_0X0_4);
	public static final Tile ARBOL_0X0_5= new TileFondo(Sprite.ARBOL_0X0_5);
	public static final Tile ARBOL_0X0_6= new TileFondo(Sprite.ARBOL_0X0_6);
	public static final Tile ARBOL_0X0_7= new TileFondo(Sprite.ARBOL_0X0_7);
	public static final Tile ARBOL_1X0_1= new TileFondo(Sprite.ARBOL_1X0_1);
	public static final Tile ARBOL_2X0_1= new TileFondo(Sprite.ARBOL_2X0_1);
	public static final Tile ARBOL_2X0_2= new TileFondo(Sprite.ARBOL_2X0_2);
	public static final Tile ARBOL_2X0_3= new TileFondo(Sprite.ARBOL_2X0_3);
	public static final Tile ARBOL_2X0_4= new TileFondo(Sprite.ARBOL_2X0_4);
	public static final Tile ARBOL_2X0_5= new TileFondo(Sprite.ARBOL_2X0_5);
	public static final Tile ARBOL_2X0_6= new TileFondo(Sprite.ARBOL_2X0_6);
	public static final Tile ARBOL_2X0_7= new TileFondo(Sprite.ARBOL_2X0_7);
	public static final Tile ARBOL_0X1_1= new TileFondo(Sprite.ARBOL_0X1_1);
	public static final Tile ARBOL_0X1_2= new TileFondo(Sprite.ARBOL_0X1_2);
	public static final Tile ARBOL_1X1_1= new TileFondo(Sprite.ARBOL_1X1_1);
	public static final Tile ARBOL_2X1_1= new TileFondo(Sprite.ARBOL_2X1_1);
	public static final Tile ARBOL_0X2_1= new TileFondo(Sprite.ARBOL_0X2_1);
	public static final Tile ARBOL_0X2_2= new TileFondo(Sprite.ARBOL_0X2_2);
	public static final Tile ARBOL_0X2_3= new TileFondo(Sprite.ARBOL_0X2_3);
	public static final Tile ARBOL_0X2_4= new TileFondo(Sprite.ARBOL_0X2_4);
	public static final Tile ARBOL_0X2_5= new TileFondo(Sprite.ARBOL_0X2_5);
	public static final Tile ARBOL_0X2_6= new TileFondo(Sprite.ARBOL_0X2_6);
	public static final Tile ARBOL_0X2_7= new TileFondo(Sprite.ARBOL_0X2_7);
	public static final Tile ARBOL_1X2_1= new TileFondo(Sprite.ARBOL_1X2_1);
	public static final Tile ARBOL_1X2_2= new TileFondo(Sprite.ARBOL_1X2_2);
	public static final Tile ARBOL_1X2_3= new TileFondo(Sprite.ARBOL_1X2_3);
	public static final Tile ARBOL_1X2_4= new TileFondo(Sprite.ARBOL_1X2_4);
	public static final Tile ARBOL_1X2_5= new TileFondo(Sprite.ARBOL_1X2_5);
	public static final Tile ARBOL_2X2_1= new TileFondo(Sprite.ARBOL_2X2_1);
	public static final Tile ARBOL_2X2_2= new TileFondo(Sprite.ARBOL_2X2_2);
	public static final Tile ARBOL_2X2_3= new TileFondo(Sprite.ARBOL_2X2_3);
	public static final Tile ARBOL_2X2_4= new TileFondo(Sprite.ARBOL_2X2_4);
	public static final Tile ARBOL_2X2_5= new TileFondo(Sprite.ARBOL_2X2_5);
	public static final Tile ARBOL_2X2_6= new TileFondo(Sprite.ARBOL_2X2_6);
	public static final Tile ARBOL_2X2_7= new TileFondo(Sprite.ARBOL_2X2_7);
	public static final Tile ARBOL_0X3_1= new TileFondo(Sprite.ARBOL_0X3_1);
	public static final Tile ARBOL_0X3_2= new TileFondo(Sprite.ARBOL_0X3_2);
	public static final Tile ARBOL_0X3_3= new TileFondo(Sprite.ARBOL_0X3_3);
	public static final Tile ARBOL_0X3_4= new TileFondo(Sprite.ARBOL_0X3_4);
	public static final Tile ARBOL_0X3_5= new TileFondo(Sprite.ARBOL_0X3_5);
	public static final Tile ARBOL_0X3_6= new TileFondo(Sprite.ARBOL_0X3_6);
	public static final Tile ARBOL_0X3_7= new TileFondo(Sprite.ARBOL_0X3_7);
	public static final Tile ARBOL_1X3_1= new TileFondo(Sprite.ARBOL_1X3_1);
	public static final Tile ARBOL_1X3_2= new TileFondo(Sprite.ARBOL_1X3_2);
	public static final Tile ARBOL_1X3_3= new TileFondo(Sprite.ARBOL_1X3_3);
	public static final Tile ARBOL_1X3_4= new TileFondo(Sprite.ARBOL_1X3_4);
	public static final Tile ARBOL_1X3_5= new TileFondo(Sprite.ARBOL_1X3_5);
	public static final Tile ARBOL_2X3_1= new TileFondo(Sprite.ARBOL_2X3_1);
	public static final Tile ARBOL_2X3_2= new TileFondo(Sprite.ARBOL_2X3_2);
	public static final Tile ARBOL_2X3_3= new TileFondo(Sprite.ARBOL_2X3_3);
	public static final Tile ARBOL_2X3_4= new TileFondo(Sprite.ARBOL_2X3_4);
	public static final Tile ARBOL_2X3_5= new TileFondo(Sprite.ARBOL_2X3_5);
	public static final Tile ARBOL_2X3_6= new TileFondo(Sprite.ARBOL_2X3_6);
	public static final Tile ARBOL_2X3_7= new TileFondo(Sprite.ARBOL_2X3_7);
	public static final Tile ARBOL_0X4_1= new TileFondo(Sprite.ARBOL_0X4_1);
	public static final Tile ARBOL_0X4_2= new TileFondo(Sprite.ARBOL_0X4_2);
	public static final Tile ARBOL_0X4_3= new TileFondo(Sprite.ARBOL_0X4_3);
	public static final Tile ARBOL_0X4_4= new TileFondo(Sprite.ARBOL_0X4_4);
	public static final Tile ARBOL_0X4_5= new TileFondo(Sprite.ARBOL_0X4_5);
	public static final Tile ARBOL_0X4_6= new TileFondo(Sprite.ARBOL_0X4_6);
	public static final Tile ARBOL_0X4_7= new TileFondo(Sprite.ARBOL_0X4_7);
	public static final Tile ARBOL_1X4_1= new TileFondo(Sprite.ARBOL_1X4_1);
	public static final Tile ARBOL_1X4_2= new TileFondo(Sprite.ARBOL_1X4_2);
	public static final Tile ARBOL_1X4_3= new TileFondo(Sprite.ARBOL_1X4_3);
	public static final Tile ARBOL_1X4_4= new TileFondo(Sprite.ARBOL_1X4_4);
	public static final Tile ARBOL_1X4_5= new TileFondo(Sprite.ARBOL_1X4_5);
	public static final Tile ARBOL_1X4_6= new TileFondo(Sprite.ARBOL_1X4_6);
	public static final Tile ARBOL_1X4_7= new TileFondo(Sprite.ARBOL_1X4_7);
	public static final Tile ARBOL_2X4_1= new TileFondo(Sprite.ARBOL_2X4_1);
	public static final Tile ARBOL_2X4_2= new TileFondo(Sprite.ARBOL_2X4_2);
	public static final Tile ARBOL_2X4_3= new TileFondo(Sprite.ARBOL_2X4_3);
	public static final Tile ARBOL_2X4_4= new TileFondo(Sprite.ARBOL_2X4_4);
	public static final Tile ARBOL_2X4_5= new TileFondo(Sprite.ARBOL_2X4_5);
	public static final Tile ARBOL_2X4_6= new TileFondo(Sprite.ARBOL_2X4_6);
	public static final Tile ARBOL_2X4_7= new TileFondo(Sprite.ARBOL_2X4_7);
	public static final Tile TOCON= new TileFondo(Sprite.TOCON);
	public static final Tile TOP_PUERTA1= new TileFondo(Sprite.TOP_PUERTA1);
	public static final Tile TOP_PUERTA2= new TileFondo(Sprite.TOP_PUERTA2);
	public static final Tile BASE_PUERTA= new TileFondo(Sprite.BASE_PUERTA);
	public static final Tile MADERA1= new TileFondo(Sprite.MADERA1);
	public static final Tile MADERA2= new TileFondo(Sprite.MADERA2);
	public static final Tile MADERA3= new TileFondo(Sprite.MADERA3);
	public static final Tile MADERA4= new TileFondo(Sprite.MADERA4);
	public static final Tile MADERA5= new TileFondo(Sprite.MADERA5);
	public static final Tile MADERA6= new TileFondo(Sprite.MADERA6);
	public static final Tile MADERA7= new TileFondo(Sprite.MADERA7);
	public static final Tile MADERA_ORILLA_IZQ= new TileFondo(Sprite.MADERA_ORILLA_IZQ);
	public static final Tile MADERA_ORILLA_DER= new TileFondo(Sprite.MADERA_ORILLA_DER);
	public static final Tile MADERA_ORILLA_DER_CONT= new TileFondo(Sprite.MADERA_ORILLA_DER_CONT);
	public static final Tile MADERA_TEJAS_ORILLA_IZQ= new TileFondo(Sprite.MADERA_TEJAS_ORILLA_IZQ);
	public static final Tile MADERA_TEJAS_ORILLA_DER= new TileFondo(Sprite.MADERA_TEJAS_ORILLA_DER);
	public static final Tile MADERA_TEJAS1= new TileFondo(Sprite.MADERA_TEJAS1);
	public static final Tile MADERA_TEJAS2= new TileFondo(Sprite.MADERA_TEJAS2);
	public static final Tile MADERA_TEJAS3= new TileFondo(Sprite.MADERA_TEJAS3);
	public static final Tile MADERA_TEJAS4= new TileFondo(Sprite.MADERA_TEJAS4);
	public static final Tile MADERA_TEJAS5= new TileFondo(Sprite.MADERA_TEJAS5);
	public static final Tile MADERA_TEJAS6= new TileFondo(Sprite.MADERA_TEJAS6);
	public static final Tile MADERA_TEJAS7= new TileFondo(Sprite.MADERA_TEJAS7);
	public static final Tile MADERA_TEJAS8= new TileFondo(Sprite.MADERA_TEJAS8);
	public static final Tile MADERA_PASTO_ORILLA_IZQ= new TileFondo(Sprite.MADERA_PASTO_ORILLA_IZQ);
	public static final Tile MADERA_PASTO_ORILLA_DER= new TileFondo(Sprite.MADERA_PASTO_ORILLA_DER);
	public static final Tile MADERA_PASTO1= new TileFondo(Sprite.MADERA_PASTO1);
	public static final Tile MADERA_PASTO2= new TileFondo(Sprite.MADERA_PASTO2);
	public static final Tile MADERA_PASTO3= new TileFondo(Sprite.MADERA_PASTO3);
	public static final Tile MADERA_PASTO4= new TileFondo(Sprite.MADERA_PASTO4);
	public static final Tile MADERA_PASTO5= new TileFondo(Sprite.MADERA_PASTO5);
	public static final Tile MADERA_PASTO6= new TileFondo(Sprite.MADERA_PASTO6);
	/**/
	
	public Tile(Sprite sprite){
		this.sprite=sprite;
		this.solido=false;
	}
	
	public Tile(Sprite sprite, boolean solido) {
		this.sprite=sprite;
		this.solido=solido;
	}

	public void mostrar(int x, int y, Pantalla pantalla){
		pantalla.mostrarTile(x<<5, y<<5, this);
	}
	
	public boolean esSolido(){
		return solido;
	}
	

}

















