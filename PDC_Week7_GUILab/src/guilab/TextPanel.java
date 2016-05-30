package guilab;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Naomi
 */
public class TextPanel extends JPanel
{
    Image img;
    public TextPanel()
    {
        // Loads the background image and stores in img object.
        this.img = Toolkit.getDefaultToolkit().createImage("bg1.jpg");
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(this.img, 0, 0, null);
    }
    
}
