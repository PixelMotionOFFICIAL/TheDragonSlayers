package Main.World.Tiles;

import java.awt.Graphics;

import FrameWork.Screen;
import Main.World.Tile;

public class tileWater extends Tile {
	
	int anim = 0;
	int ss = -1;

	public tileWater(String n, String path, int color) {
		super(n, path, color);
	}
	
	public void render(int x, int y, Graphics g, Screen s) {
		anim++;
		if(anim % 35000 == 0) {
			ss *= -1;
		}
		
		if(ss == -1) s.renderTile(x, y, this.texture, g);
		if(ss == 1) s.renderTile(x, y, water1.texture, g);
	}

}
