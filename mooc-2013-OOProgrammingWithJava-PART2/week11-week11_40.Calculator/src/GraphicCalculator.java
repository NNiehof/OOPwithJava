
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;


public class GraphicCalculator implements Runnable {
    
    private JFrame frame;
    private Calculator calculator;
    private JTextField inputField;
    private JTextField outputField;
    
    public GraphicCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(600, 400));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        
        this.outputField = new JTextField("0");
        // disable the ouput field: cannot be edited by the user
        this.outputField.setEnabled(false);
        
        this.inputField = new JTextField("0");
        
        JPanel panel = createPanel(this.inputField, this.outputField);
        
        container.add(this.outputField);
        container.add(this.inputField);
        container.add(panel);
    }
    
    private JPanel createPanel(JTextField inputField,
            JTextField outputField) {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton zButton = new JButton("z");
        
        // add listeners to buttons
        ButtonListener addListen = new ButtonListener(this.calculator,
        inputField, outputField, "add");
        addButton.addActionListener(addListen);
        
        ButtonListener subtractListen = new ButtonListener(this.calculator,
        inputField, outputField, "subtract");
        subtractButton.addActionListener(subtractListen);
        
        ButtonListener zListen = new ButtonListener(this.calculator,
        inputField, outputField, "z");
        zButton.addActionListener(zListen);
        zButton.setEnabled(false);
        
        // add listener to outputField, which disables zButton if the content
        // of outputField equals "0"
        this.outputField.getDocument().addDocumentListener(new TextListener(
        this.outputField, zButton));
        
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(zButton);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
