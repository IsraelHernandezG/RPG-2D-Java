package mapas.tiles;

import graficos.Sprite;

public class TileFondo extends Tile{

	public TileFondo(Sprite sprite) {
		super(sprite);
		this.solido=false;
	}
	public boolean esSolido(){
		return solido;
	}

}
























