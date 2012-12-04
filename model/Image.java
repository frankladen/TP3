package model;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import tp3.Subject;

public class Image extends Subject  {
	
	private BufferedImage image;
	
	public Image () {
	
	}

	public void changeImage(String imageSource) {
		try {                
			image = ImageIO.read(new File(imageSource));
		} catch (IOException ex) {
			System.out.println("Chemin de l'image invalide");
		}		
	}
	
	
}