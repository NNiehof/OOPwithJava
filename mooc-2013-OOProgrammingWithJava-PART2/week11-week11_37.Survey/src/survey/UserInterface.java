package survey;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(600, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        // First question
        container.add(new JLabel("Are you?"));

        JCheckBox arie = new JCheckBox("Yes!");
        JCheckBox indra = new JCheckBox("No!");

        ButtonGroup checkBoxGroup = new ButtonGroup();
        checkBoxGroup.add(arie);
        checkBoxGroup.add(indra);

        container.add(arie);
        container.add(indra);

        // Second question
        container.add(new JLabel("Why?"));

        JRadioButton stripes = new JRadioButton("No reason.");
        JRadioButton dots = new JRadioButton("Because it is fun!");

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(stripes);
        radioButtonGroup.add(dots);

        container.add(stripes);
        container.add(dots);

        // End button
        JButton done = new JButton("Done!");
        container.add(done);
    }


    public JFrame getFrame() {
        return frame;
    }
}
