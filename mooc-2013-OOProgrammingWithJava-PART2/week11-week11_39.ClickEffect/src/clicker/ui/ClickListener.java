package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClickListener.java
 * Author: nniehof
 */

public class ClickListener implements ActionListener {

    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.calculator.increase();
        int clickCount = this.calculator.giveValue();
        this.label.setText(Integer.toString(clickCount));
    }
}
