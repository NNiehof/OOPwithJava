
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 * TextListener.java
 *
 * @author NNiehof
 */

public class TextListener implements DocumentListener {

    private JTextField textField;
    private JButton button;
    
    public TextListener(JTextField textField, JButton button) {
        this.textField = textField;
        this.button = button;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        updateButton();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateButton();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        updateButton();
    }
    
    public void updateButton() {
        // disable the button if the text is "0"
        if (this.textField.getText().equals("0")) {
            this.button.setEnabled(false);
        }
        else {
            this.button.setEnabled(true);
        }
    }

}
