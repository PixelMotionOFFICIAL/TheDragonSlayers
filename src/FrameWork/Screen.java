package FrameWork;

import java.awt.Graphics;
import java.awt.Image;

import Main.Start;
import Main.World.Level;

public class Screen {

	public int WIDTH, HEIGHT;
	public int xOffset, yOffset;
	public int spriteSize;
	
	public int[] pixels;
	
	Graphics graph;

	public int playerWidth, playerHeight;

	public Screen(int width, int height, int spriteSize) {
		WIDTH = width;
		HEIGHT = height;
		this.spriteSize = spriteSize;
	}

	public void render(int x, int y, Image sprite, Graphics g) {

		g.drawImage(sprite, x * spriteSize + xOffset, y * spriteSize + yOffset, spriteSize, spriteSize, null);
	}

	public void renderEntity(Graphics g, int x, int y, int xa, int ya, Image sprite) {
		if (x < Start.width && y < Start.height)
			if (x + xa > 0 && y + ya > 0) {
				g.drawImage(sprite, x, y, xa, ya, null);
				Level.renderedEntitys++;
			}
	}
	
	public void renderPlayer(Graphics g, int x, int y, Image sprite) {
		playerWidth = 58;
		playerHeight = 62;

		x += xOffset;
		y += yOffset;
		if (x < Start.width && y < Start.height)
			if (x + playerWidth > 0 && y + playerHeight > 0) {
				g.drawImage(sprite, x, y, playerWidth, playerHeight, null);
				Level.renderedMobs++;
			}
	}
	
	public void renderMob(Graphics g, int x, int y, int xa, int ya, Image sprite) {

		int scale = 1;

		playerWidth = xa * scale;
		playerHeight = ya * scale;

		x += xOffset;
		y += yOffset;
		if (x < Start.width && y < Start.height)
			if (x + playerWidth > 0 && y + playerHeight > 0) {
				g.drawImage(sprite, x, y, playerWidth, playerHeight, null);
				Level.renderedMobs++;
			}
	}

	public void setOffset(int x, int y, Graphics g) {
		xOffset = x;
		graph = g;
		yOffset = y;
	}

	public void renderTile(int x, int y, Image texture, Graphics g) {
		g.drawImage(texture, x * spriteSize + xOffset, y * spriteSize + yOffset, spriteSize, spriteSize, null);
	}
	
	public void renderSpriteTest(int xp, int yp, Sprite sprite) {
		xp -= xOffset;
		yp -= yOffset;
		
		for(int y = 0; y < sprite.SIZE; y++) {
			int ya = y + yp;
        for(int x = 0; x < sprite.SIZE; x++) {
		    int xa = x + xp;
		   
		    if(xa < -sprite.SIZE || xa >= WIDTH || ya < 0 || ya >= HEIGHT) break;
		    if (xa < 0) xa = 0;
		    int col = sprite.pixels[x + y * sprite.SIZE];
		    if(col != 0xffff00ff) pixels[xa + ya * WIDTH] = col;
			
			}
		}
	}

}
