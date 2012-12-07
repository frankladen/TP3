import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageViewer extends JPanel
{
	public ImageViewer() 
	{
      
    }

    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawRect(0,0, 330, 30);
        g.drawRect(0, 35, 330, 330);
        //g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }
}
