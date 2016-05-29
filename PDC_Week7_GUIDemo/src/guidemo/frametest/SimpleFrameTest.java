package guidemo.frametest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Naomi
 */
public class SimpleFrameTest extends JFrame
{
    
    public SimpleFrameTest()
    {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        int frameWidth = screenWidth/2;
        int frameHeight = screenHeight/2;
        
        this.setSize(frameWidth, frameHeight);
        this.setTitle("A Simple Frame");
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setLayout(new FlowLayout());
        
        MyComponent myComp = new MyComponent();
        this.add(myComp);
        
//        JLabel label = new JLabel("Program Design & Construction");
//        label.setForeground(Color.red);
//        add(label);
        
        this.pack();
        
//        JButton blueButton = new JButton("Blue");
//        this.add(blueButton);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SimpleFrameTest frame = new SimpleFrameTest();
    }
    
}
