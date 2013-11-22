package FrameWork;

import java.awt.image.BufferedImage;

import Flash.Images.FImage;

public class SpriteSheet {

	public BufferedImage image;
	public int width, height;
	
	
	public static SpriteSheet tiles = new SpriteSheet("/tiles.png");
	
	
	public SpriteSheet(String path) {
		image = FImage.loadBufferedImage(path);
		width = image.getWidth();
		height = image.getHeight();
	}
	
}
