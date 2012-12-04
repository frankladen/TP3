package controller.command;

import controller.GlobalController;
import model.Perspective;

public class CommandUndo  implements Command {
	
	Perspective perspective;
	GlobalController gb;
	
	public CommandUndo () {
	
	}
	
	public void execute () {
		gb.undoAction(perspective);
	}
}