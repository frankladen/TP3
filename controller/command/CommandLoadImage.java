package controller.command;

import model.Image;

public class CommandLoadImage  implements Command {
	
	private String imageSource;
	private Image image;
	
	public CommandLoadImage (String imageSource, Image image) {
		this.imageSource = imageSource;
		this.image = image;
	}
	
	public void execute () {
		image.changeImage(imageSource);
	}
}