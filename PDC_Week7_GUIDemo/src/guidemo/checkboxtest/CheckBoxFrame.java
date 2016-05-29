package guidemo.checkboxtest;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Naomi
 */

/**
 * A frame with a sample text label and check boxes for selecting font attributes
 */
public class CheckBoxFrame extends JFrame
{
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 24;
    
    public CheckBoxFrame()
    {
        //add the sample text label
        label = new JLabel("I'm super Naomi.");
        label.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
        add(label, BorderLayout.NORTH);
        
        //this listener sets the font attribute of
        //the label to the check box state
        
        ActionListener listener = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    int mode = 0;
                    if(bold.isSelected())
                        //Font.BOLD = 1
                        mode += Font.BOLD;
                    if(italic.isSelected())
                        //Font.ITALIC = 2
                        mode += Font.ITALIC;
                    label.setFont(new Font("Serif", mode, FONTSIZE));
                }
            };
        
        //add the check boxes
        JPanel buttonPanel = new JPanel();
        
        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
        bold.setSelected(true);
        buttonPanel.add(bold);
        
        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        buttonPanel.add(italic);
        
        add(buttonPanel, BorderLayout.CENTER);
        pack();
    }
}
