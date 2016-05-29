package guidemo.combotest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Naomi
 */

/**
 * A frame with a sample text label and a combo box for selecting font faces.
 */
public class ComboBoxFrame extends JFrame
{
    private JComboBox<String> faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 24;
    
    public ComboBoxFrame()
    {
        //add the sample text label
        label = new JLabel("Program Design & Construction");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);
        
        //make a combo box and add face names
        faceCombo = new JComboBox();
        faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");
        
        //the combo box listener changes the label font to the selectedface name
        
        faceCombo.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                label.setFont(new Font((String)faceCombo.getSelectedItem(), Font.PLAIN, DEFAULT_SIZE));
            }
        });
        
        //add combo box to a panel at the frame's southern border
        
        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.SOUTH);
        pack();
    }
}
