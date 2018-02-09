package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * ActionEventListener.java
 *
 * @author NNiehof
 */

public class ActionEventListener implements ActionListener {

    private JTextField textInputField;
    private JLabel textOutputArea;
    
    public ActionEventListener(JTextField textInputField, JLabel textOutputArea) {
        this.textInputField = textInputField;
        this.textOutputArea = textOutputArea;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // copy text from input field to output area, wipe input field
        this.textOutputArea.setText(this.textInputField.getText());
        this.textInputField.setText("");
    }

}
