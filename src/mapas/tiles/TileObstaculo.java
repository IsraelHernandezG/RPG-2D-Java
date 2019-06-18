package mapas.tiles;

import graficos.Sprite;

public class TileObstaculo extends Tile{
	
	public TileObstaculo(Sprite sprite, boolean solido) {
		super(sprite,true);
	}
	
	public boolean esSolido(){
		return solido;
	}

}
