import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class principalView extends JFrame
{
	principalView()
	{
		initialiseView();
	}
	
	void initialiseView()
	{
		//1. Create the frame.
		JFrame frame = new JFrame("Images Factory");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		
		frame.pack();
		frame.setSize(700, 430);
		
		
		/*
		JPanel panel = new JPanel(new BorderLayout() );
		panel.add(new ImageViewer(), BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel(new BorderLayout() );
		panel2.add(new thumbNailViewer(), BorderLayout.CENTER);
		
		frame.add(panel);
		frame.add(panel2); */
		
	    Container pane = frame.getContentPane();
	    pane.setLayout(new BoxLayout(pane, BoxLayout.LINE_AXIS));  // any LayoutManager you
	    pane.add(new thumbNailViewer());
	    pane.add(new ImageViewer());

	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);

		
		initialiseMenu(frame);
	}
	
	void initialiseMenu(JFrame mainFrame)
	{
		JMenuBar menuBar = mainFrame.getJMenuBar();
	    if(menuBar == null) 
	    {
	       menuBar = new JMenuBar();
	       mainFrame.setJMenuBar(menuBar);
	    }
	    
	    JMenu menuFichier = new JMenu("Fichier");
	    menuFichier.add(new JMenuItem("Ouvrir"));
	    menuFichier.add(new JMenuItem("Sauvegarder"));
	    menuFichier.add(new JMenuItem("Quitter"));
	    
	    menuFichier.getItem(0).addActionListener(new OpenListener());
	    menuFichier.getItem(1).addActionListener(new SaveListener());
	    menuFichier.getItem(2).addActionListener(new ExitListener());
	    
	  
	    JMenu menuOperations = new JMenu("Opérations"); 
	    menuOperations.add(new JMenuItem("Zoom"));
	    menuOperations.add(new JMenuItem("Translation")); 
	    menuOperations.add(new JMenuItem("Annuler"));
	    
	    menuOperations.getItem(0).addActionListener(new ZoomListener());
	    menuOperations.getItem(1).addActionListener(new TranslationListener());
	    menuOperations.getItem(2).addActionListener(new UndoListener());
	    
	    menuBar.add(menuFichier);
	    menuBar.add(menuOperations);
	}
}


class OpenListener implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0) 
	{
		
	}
}

class SaveListener implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0) 
	{
	
	}
}

class ExitListener implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0) 
	{
		System.exit(0);
	}
}



class ZoomListener implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0) 
	{

	}
}

class TranslationListener implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0) 
	{
	
	}
}

class UndoListener implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0) 
	{
		
	}
}
