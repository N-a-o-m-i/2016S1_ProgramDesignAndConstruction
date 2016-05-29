package guidemo.radiotest;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Naomi
 */
public class RadioButtonTest 
{
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                JFrame frame = new RadioButtonFrame();
                frame.setTitle("RadioButtonTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
