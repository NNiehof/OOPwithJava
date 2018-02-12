
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


/**
 * PlusListener.java
 *
 * @author NNiehof
 */

public class ButtonListener implements ActionListener {
    
    private Calculator calculator;
    private JTextField inputField;
    private JTextField outputField;
    private String buttonType;

    public ButtonListener(Calculator calculator, JTextField inputField,
            JTextField outputField, String buttonType) {
        this.calculator = calculator;
        this.inputField = inputField;
        this.outputField = outputField;
        this.buttonType = buttonType;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        int number = 0;
        
        // if the input can't be converted to a valid integer, set it to "0"
        try {
        number = Integer.parseInt(this.inputField.getText());
        }
        catch (NumberFormatException e) {
            this.inputField.setText("");
        }
        
        if (buttonType.equals("add")) {
            this.calculator.add(number);
        }
        else if (buttonType.equals("subtract")) {
            this.calculator.subtract(number);
        }
        else if (buttonType.equals("z")) {
            this.calculator.reset();
        }
        
        this.outputField.setText(this.calculator.getResult());
        this.inputField.setText("");
    }

}
