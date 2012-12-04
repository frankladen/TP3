package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import model.Image;
import model.Perspective;

public class GlobalController  implements ActionListener {
	private Image image;
	private PerspectiveController thumbNailController;
	private PerspectiveController imageViewer1Controller;
	private PerspectiveController imageViewer2Controller;
	
	public GlobalController () {
	}

	@Override
	public void actionPerformed(ActionEvent event) {

	}

	public void undoAction(Perspective perspective) {
		
	}


}