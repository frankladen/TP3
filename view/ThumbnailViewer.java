import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class thumbNailViewer extends JPanel
{
	public thumbNailViewer() 
	{
      
    }

    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawRect(0,0, 120, 30);
        g.drawString("Perpectives", 10, 20);
        
        g.drawRect(0, 35, 120, 330);
        
        g.drawRect(10, 45, 100, 100);
        g.drawRect(10, 150, 100, 100);
        g.drawRect(10, 255, 100, 100);
        
        //g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }
}
