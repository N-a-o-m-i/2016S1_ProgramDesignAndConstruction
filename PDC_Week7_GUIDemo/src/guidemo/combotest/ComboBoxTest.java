package guidemo.combotest;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Naomi
 */
public class ComboBoxTest 
{
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                JFrame frame = new ComboBoxFrame();
                frame.setTitle("ComboBoxTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });   
    }
}
