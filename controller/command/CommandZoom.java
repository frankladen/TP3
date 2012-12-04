package controller.command;

import model.Perspective;

public class CommandZoom  implements Command {
	
	private Perspective perspective;
	private double zoomLevel;
	
	public CommandZoom (Perspective p, int zoomLevel) {
	
		this.perspective = p;
		this.zoomLevel = zoomLevel;
	}
	
	public void execute () {
		this.perspective.zoom(zoomLevel);
	}
}