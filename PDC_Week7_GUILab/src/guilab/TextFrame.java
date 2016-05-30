package guilab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Naomi
 */
public class TextFrame extends JFrame implements ActionListener
{
    private static TextFrame bt;
    private JPanel bottomPanel;
    private JPanel comboPanel;
    private JButton submitButton;
    private JTextField textField;
    private JPanel textPanel;
    private JLabel textLabel;
    private JComboBox<String> fontCombo;
    private JComboBox<String> sizeCombo;
    
    private int fontSize = 20;
    private String font = "Serif";

    public static void main(String[] args) 
    {
        
        
        
    }

    public TextFrame()
    {
        textPanel = new TextPanel();
        text
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
