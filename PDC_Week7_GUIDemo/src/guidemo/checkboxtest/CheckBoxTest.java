package guidemo.checkboxtest;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Naomi
 */
public class CheckBoxTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                JFrame frame = new CheckBoxFrame();
                frame.setTitle("CheckBoxTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });   
    }
}
