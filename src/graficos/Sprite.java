package graficos;

public final class Sprite {
	private final int dimension;
	private int ancho;
	private int alto;
	private int x;
	private int y;
	
	private HojaSprites hoja;
	
	public int[] pixeles;
	
	/* Sprites del mapa pueblo*/
	public static final Sprite VACIO= new Sprite(32,0);
	public static final Sprite PASTO0= new Sprite(32,0,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PASTO1= new Sprite(32,1,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PASTO2= new Sprite(32,2,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PASTO3= new Sprite(32,3,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PASTO_FLORES0= new Sprite(32,4,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PASTO_FLORES1= new Sprite(32,5,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PASTO_FLORES2= new Sprite(32,6,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_IZ= new Sprite(32,7,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_DER= new Sprite(32,8,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_UP1= new Sprite(32,9,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_UP2= new Sprite(32,10,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_DOWN1= new Sprite(32,11,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_DOWN2= new Sprite(32,12,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_ESQUINA1= new Sprite(32,13,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_ESQUINA2= new Sprite(32,14,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_ESQUINA3= new Sprite(32,15,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_ESQUINA4= new Sprite(32,16,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_CENTRO1= new Sprite(32,17,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_CENTRO2= new Sprite(32,18,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_CENTRO3= new Sprite(32,19,0,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite SENDERO_CENTRO4= new Sprite(32,19,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_IZQ_TECHO1= new Sprite(32,0,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_IZQ_TECHO2= new Sprite(32,0,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_IZQ_TECHO3= new Sprite(32,0,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_IZQ_TECHO4= new Sprite(32,0,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_IZQ_TECHO5= new Sprite(32,0,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite TECHO= new Sprite(32,0,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO1= new Sprite(32,1,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO2= new Sprite(32,1,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO3= new Sprite(32,1,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO4= new Sprite(32,1,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO5= new Sprite(32,1,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO6= new Sprite(32,1,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_IZQ_TECHO7= new Sprite(32,1,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite CENTRO_TECHO1= new Sprite(32,2,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite CENTRO_TECHO2= new Sprite(32,2,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite CENTRO_TECHO3= new Sprite(32,2,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite CENTRO_TECHO4= new Sprite(32,2,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite CENTRO_TECHO5= new Sprite(32,2,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite CENTRO_TECHO6= new Sprite(32,2,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PUNTA_CHIM1= new Sprite(32,3,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PUNTA_CHIM2= new Sprite(32,3,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PUNTA_CHIM3= new Sprite(32,3,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PUNTA_CHIM4= new Sprite(32,3,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PUNTA_CHIM5= new Sprite(32,3,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite PUNTA_CHIM6= new Sprite(32,3,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite BASE_CHIM= new Sprite(32,3,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO1= new Sprite(32,4,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO2= new Sprite(32,4,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO3= new Sprite(32,4,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO4= new Sprite(32,4,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO5= new Sprite(32,4,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO6= new Sprite(32,4,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ESQ_DER_TECHO7= new Sprite(32,4,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_DER_TECHO1= new Sprite(32,5,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_DER_TECHO2= new Sprite(32,5,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_DER_TECHO3= new Sprite(32,5,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_DER_TECHO4= new Sprite(32,5,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite LADO_DER_TECHO5= new Sprite(32,5,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_0X0_1= new Sprite(32,6,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X0_2= new Sprite(32,6,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X0_3= new Sprite(32,6,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X0_4= new Sprite(32,6,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X0_5= new Sprite(32,6,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X0_6= new Sprite(32,6,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X0_7= new Sprite(32,6,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_1X0_1= new Sprite(32,8,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_2X0_1= new Sprite(32,7,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X0_2= new Sprite(32,7,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X0_3= new Sprite(32,7,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X0_4= new Sprite(32,7,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X0_5= new Sprite(32,7,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X0_6= new Sprite(32,7,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X0_7= new Sprite(32,7,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_0X1_1= new Sprite(32,8,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X1_2= new Sprite(32,8,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_1X1_1= new Sprite(32,8,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_2X1_1= new Sprite(32,8,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_0X2_1= new Sprite(32,9,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X2_2= new Sprite(32,9,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X2_3= new Sprite(32,9,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X2_4= new Sprite(32,9,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X2_5= new Sprite(32,9,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X2_6= new Sprite(32,9,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X2_7= new Sprite(32,9,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_1X2_1= new Sprite(32,10,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X2_2= new Sprite(32,10,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X2_3= new Sprite(32,10,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X2_4= new Sprite(32,10,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X2_5= new Sprite(32,10,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_2X2_1= new Sprite(32,11,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X2_2= new Sprite(32,11,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X2_3= new Sprite(32,11,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X2_4= new Sprite(32,11,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X2_5= new Sprite(32,11,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X2_6= new Sprite(32,11,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X2_7= new Sprite(32,11,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_0X3_1= new Sprite(32,12,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X3_2= new Sprite(32,12,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X3_3= new Sprite(32,12,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X3_4= new Sprite(32,12,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X3_5= new Sprite(32,12,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X3_6= new Sprite(32,12,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X3_7= new Sprite(32,12,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_1X3_1= new Sprite(32,13,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X3_2= new Sprite(32,13,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X3_3= new Sprite(32,13,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X3_4= new Sprite(32,13,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X3_5= new Sprite(32,13,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_2X3_1= new Sprite(32,14,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X3_2= new Sprite(32,14,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X3_3= new Sprite(32,14,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X3_4= new Sprite(32,14,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X3_5= new Sprite(32,14,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X3_6= new Sprite(32,14,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X3_7= new Sprite(32,14,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite ARBOL_0X4_1= new Sprite(32,15,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X4_2= new Sprite(32,15,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X4_3= new Sprite(32,15,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X4_4= new Sprite(32,15,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X4_5= new Sprite(32,15,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X4_6= new Sprite(32,15,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_0X4_7= new Sprite(32,15,7,0,HojaSprites.MAPA_PUEBLO_INICIO);

	public static final Sprite ARBOL_1X4_1= new Sprite(32,16,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X4_2= new Sprite(32,16,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X4_3= new Sprite(32,16,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X4_4= new Sprite(32,16,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X4_5= new Sprite(32,16,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X4_6= new Sprite(32,16,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_1X4_7= new Sprite(32,16,7,0,HojaSprites.MAPA_PUEBLO_INICIO);

	public static final Sprite ARBOL_2X4_1= new Sprite(32,17,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X4_2= new Sprite(32,17,2,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X4_3= new Sprite(32,17,3,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X4_4= new Sprite(32,17,4,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X4_5= new Sprite(32,17,5,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X4_6= new Sprite(32,17,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite ARBOL_2X4_7= new Sprite(32,17,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite TOCON= new Sprite(32,18,1,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite TOP_PUERTA1= new Sprite(32,5,6,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite TOP_PUERTA2= new Sprite(32,5,7,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite BASE_PUERTA= new Sprite(32,5,8,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	public static final Sprite MADERA1= new Sprite(32,0,8,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA2= new Sprite(32,1,8,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA3= new Sprite(32,2,8,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA4= new Sprite(32,3,8,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA5= new Sprite(32,4,8,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA6= new Sprite(32,0,9,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA7= new Sprite(32,1,9,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_ORILLA_IZQ= new Sprite(32,2,9,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_ORILLA_DER= new Sprite(32,3,9,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_ORILLA_DER_CONT= new Sprite(32,4,9,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS_ORILLA_IZQ= new Sprite(32,0,10,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS_ORILLA_DER= new Sprite(32,4,10,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS1= new Sprite(32,1,10,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS2= new Sprite(32,2,10,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS3= new Sprite(32,3,10,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS4= new Sprite(32,0,11,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS5= new Sprite(32,1,11,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS6= new Sprite(32,2,11,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS7= new Sprite(32,3,11,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_TEJAS8= new Sprite(32,4,11,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO_ORILLA_IZQ= new Sprite(32,0,12,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO_ORILLA_DER= new Sprite(32,4,12,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO1= new Sprite(32,1,12,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO2= new Sprite(32,2,12,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO3= new Sprite(32,3,12,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO4= new Sprite(32,0,13,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO5= new Sprite(32,1,13,0,HojaSprites.MAPA_PUEBLO_INICIO);
	public static final Sprite MADERA_PASTO6= new Sprite(32,2,13,0,HojaSprites.MAPA_PUEBLO_INICIO);
	
	/*sprites jugador*/
	public static final Sprite SARA_ARRIBA1= new Sprite(29,51,0,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA2= new Sprite(29,51,1,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA3= new Sprite(29,51,2,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA4= new Sprite(29,51,3,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA5= new Sprite(29,51,4,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA6= new Sprite(29,51,5,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA7= new Sprite(29,51,6,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA8= new Sprite(29,51,7,0,0,HojaSprites.SARA);
	public static final Sprite SARA_ARRIBA9= new Sprite(29,51,8,0,0,HojaSprites.SARA);
	
	public static final Sprite SARA_IZQUIERDA1= new Sprite(29,51,0,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA2= new Sprite(29,51,1,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA3= new Sprite(29,51,2,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA4= new Sprite(29,51,3,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA5= new Sprite(29,51,4,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA6= new Sprite(29,51,5,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA7= new Sprite(29,51,6,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA8= new Sprite(29,51,7,1,0,HojaSprites.SARA);
	public static final Sprite SARA_IZQUIERDA9= new Sprite(29,51,8,1,0,HojaSprites.SARA);
	
	public static final Sprite SARA_ABAJO1= new Sprite(29,51,0,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO2= new Sprite(29,51,1,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO3= new Sprite(29,51,2,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO4= new Sprite(29,51,3,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO5= new Sprite(29,51,4,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO6= new Sprite(29,51,5,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO7= new Sprite(29,51,6,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO8= new Sprite(29,51,7,2,0,HojaSprites.SARA);
	public static final Sprite SARA_ABAJO9= new Sprite(29,51,8,2,0,HojaSprites.SARA);
	
	public static final Sprite SARA_DERECHA1= new Sprite(29,51,0,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA2= new Sprite(29,51,1,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA3= new Sprite(29,51,2,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA4= new Sprite(29,51,3,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA5= new Sprite(29,51,4,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA6= new Sprite(29,51,5,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA7= new Sprite(29,51,6,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA8= new Sprite(29,51,7,3,0,HojaSprites.SARA);
	public static final Sprite SARA_DERECHA9= new Sprite(29,51,8,3,0,HojaSprites.SARA);
	
	/**/
	
	public Sprite(final int dimension, final int columna, final int fila, final int version, final HojaSprites hoja){
		this.dimension=dimension;
		
		pixeles= new int[dimension*dimension];
		
		this.x=columna*dimension;
		this.y=fila*dimension;
		
		this.hoja=hoja;
		
		cargaSprite(version);
	}
	
	public Sprite(final int dimension, final int color){
		this.dimension=dimension;
		pixeles=new int[dimension*dimension];
		
		for (int i=0; i<pixeles.length;i++){
			pixeles[i]=color;
		}
	}
	
	public Sprite(final int ancho, final int alto, final int columna, final int fila, final int version, final HojaSprites hoja){
		
		this.ancho=ancho;
		this.alto=alto;
		this.dimension=0;
		pixeles= new int[ancho*alto];
		
		this.x=columna*ancho;
		this.y=fila*alto;
		this.hoja=hoja;
		
		for(int y=0; y<alto; y++){
			for(int x=0; x<ancho; x++){
				
				pixeles[x+y*ancho]=hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()];
				
					
			}
		}
	}
	
	private void cargaSprite(int version){
		if (version == 0){
			cargaNormal();
		}else{
			int[] temp=iniciarArrayTemp();
			switch(version){
			case 1:
				invertirX(temp);
				break;
			case 2:
				invertirY(temp);
				break;
			case 3:
				invertirXY(temp);
				break;
			case 4:
				rotar90DER_invertirX(temp);
				break;
			case 5:
				rotar90DER(temp);
				break;
			case 6:
				rotar90IZQ(temp);
				break;
			case 7:
				rotar90IZQ_invertirX(temp);
				break;
			default:
				cargaNormal();
			}
		}
	}
	
	private void rotar90IZQ_invertirX(int[] temp) {
		int i=0;
		for(int x=dimension-1; x>-1; x--){
			for(int y=dimension-1; y>-1; y--){
				pixeles[i]=temp[x+y*dimension];
				i++;
			}
		}
		
	}

	private void rotar90IZQ(int[] temp) {
		int i=0;
		for(int x=dimension-1; x>-1; x--){
			for(int y=0; y<dimension; y++){
				pixeles[i]=temp[x+y*dimension];
				i++;
			}
		}
		
	}

	private void rotar90DER(int[] temp) {
		int i=0;
		for(int x=0; x<dimension; x++){
			for(int y=dimension-1; y>-1; y--){
				pixeles[i]=temp[x+y*dimension];
				i++;
			}
		}
		
	}

	private void rotar90DER_invertirX(int[] temp) {
		int i=0;
		for(int x=0; x<dimension; x++){
			for(int y=0; y<dimension; y++){
				pixeles[i]=temp[x+y*dimension];
				i++;
			}
		}
	}

	private void invertirXY(int[] temp) {
		for(int i=0; i<temp.length; i++){
			pixeles[i]=temp[temp.length-1-i];
		}
		
	}

	private void invertirY(int[] temp) {
		int i=0;
		for(int y=dimension-1; y>-1; y--){
			for(int x=0; x<dimension; x++){
				pixeles[i]=temp[x+y*dimension];
				i++;
			}
		}
	}

	private void invertirX(int[] temp) {
		int i=0;
		for(int y=0; y<dimension; y++){
			for(int x=dimension-1; x>-1; x--){
				pixeles[i]=temp[x+y*dimension];
				i++;
			}
		}
	}

	private int[] iniciarArrayTemp() {
		int[] temp= new int[dimension*dimension];
		for(int y=0; y<dimension; y++){
			for(int x=0; x<dimension; x++){
				temp[x+y*dimension]=hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()];
			}
		}
		
		return temp;
	}

	private void cargaNormal() {
		for(int y=0; y<dimension; y++){
			for(int x=0; x<dimension; x++){
				pixeles[x+y*dimension]=hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()];
			}
		}
	}

	
	
	public int getDimension() {
		return dimension;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	

}
