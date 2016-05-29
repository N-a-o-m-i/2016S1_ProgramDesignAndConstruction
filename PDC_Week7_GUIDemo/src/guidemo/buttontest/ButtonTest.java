package guidemo.buttontest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Naomi
 */
public class ButtonTest extends JFrame
{
    private static ButtonTest bt;
    private JPanel buttonPanel;
    
    public static void main(String[] args)
    {
        bt = new ButtonTest();
        bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt.setVisible(true);
    }
    
    public ButtonTest()
    {
        buttonPanel = new JPanel();
        //create two buttons
        JButton blueButton = new JButton("blue");
        JButton redButton = new JButton("red");
        //create two actionListeners on two buttons and set the color of bg
        ActionListener blueAction = new ColorAction(Color.BLUE);
        ActionListener redAction = new ColorAction(Color.RED);
        //add two ActionListener to the Button
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
        //add two buttons to the panel
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        
        this.setSize(300, 200);
        this.add(buttonPanel);
    }
    
    public class ColorAction implements ActionListener
    {
        private Color backgroundColor;
        public ColorAction(Color c)
        {
            backgroundColor = c;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}
