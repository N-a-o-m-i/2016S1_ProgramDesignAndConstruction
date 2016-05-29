package guidemo.frametest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Naomi
 */
public class MyComponent extends JComponent 
{
    private Image image;
    private int compWidth = 500;
    private int compHeight = 300;
    
    public void paintComponent(Graphics g)
    {
        image = new ImageIcon("aut.jpg").getImage();
        g.drawImage(image, 0, 0, null);
        
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD, 25));
        g.drawString("Program Design & Construction", 10, 30);
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(compWidth, compHeight);
    }
}
