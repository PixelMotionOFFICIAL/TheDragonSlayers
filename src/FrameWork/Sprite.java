package FrameWork;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Sprite {

	public int[] pixels;
	public int width, height;
	public Image image;

	public static Sprite random = new Sprite(0, 0, 64, 64, SpriteSheet.tiles);

	public Sprite(int x, int y, int width, int height, SpriteSheet s) {
		BufferedImage b = s.image;
		image = s.image;
		this.width = width;
		this.height = height;

		b.getRGB(x, y, width, height, pixels, 0, width);

		((BufferedImage) image).setRGB(0, 0, width, height, pixels, 0, width);

	}

}
