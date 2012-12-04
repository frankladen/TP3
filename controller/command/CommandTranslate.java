package controller.command;

import java.awt.Point;

import model.Perspective;

public class CommandTranslate  implements Command {
	
	private Perspective perspective;
	private Point point;
	
	
	public CommandTranslate (Perspective persp, Point p) {
		this.perspective = persp;
		this.point = p;
	}
	
	public void execute () {
		this.perspective.translate(point);
	}
}