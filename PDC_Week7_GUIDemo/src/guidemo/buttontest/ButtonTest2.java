package guidemo.buttontest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Naomi
 */
public class ButtonTest2 extends JFrame implements ActionListener
{
    private static ButtonTest2 bt;
    private JPanel buttonPanel;
    private JButton blueButton;
    private JButton redButton;
    private JButton whiteButton;
    private JButton yellowButton;
    private JButton greenButton;
    private JButton pinkButton;
    private JButton orangeButton;
    private JLabel blackLabel;
    //Color bakcgroundColor;
    
    public static void main(String[] args)
    {
        bt = new ButtonTest2();
        bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt.setVisible(true);
    }
    
    public ButtonTest2()
    {
        buttonPanel = new JPanel();
        blueButton = new JButton("blue");
        redButton = new JButton("red");
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        
        buttonPanel.setLayout(new GridLayout(3,4));
        
        //this is a Label not a button, so looks different from button
        blackLabel = new JLabel("Black", JLabel.CENTER);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        buttonPanel.add(blackLabel);
        blackLabel.setText("BLK");
        
        whiteButton = new JButton("White");
        yellowButton = new JButton("yellow");
        greenButton = new JButton("green");
        pinkButton = new JButton("pink");
        orangeButton = new JButton("orange");
        
        whiteButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
        pinkButton.addActionListener(this);
        orangeButton.addActionListener(this);
        
        buttonPanel.add(whiteButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(pinkButton);
        buttonPanel.add(orangeButton);
        this.setSize(300,200);
        
        this.add(buttonPanel, BorderLayout.SOUTH);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == blueButton)
        {
            buttonPanel.setBackground(Color.BLUE);
        }
        if(source == redButton)
        {
            buttonPanel.setBackground(Color.red);
        }
        if(source == whiteButton)
        {
            buttonPanel.setBackground(Color.WHITE);
        }
        if(source == yellowButton)
        {
            buttonPanel.setBackground(Color.YELLOW);
        }
        if(source == greenButton)
        {
            buttonPanel.setBackground(Color.GREEN);
        }
        if(source == pinkButton)
        {
            buttonPanel.setBackground(Color.PINK);
        }
        if(source == orangeButton)
        {
            buttonPanel.setBackground(Color.ORANGE);
        }
    }

}
