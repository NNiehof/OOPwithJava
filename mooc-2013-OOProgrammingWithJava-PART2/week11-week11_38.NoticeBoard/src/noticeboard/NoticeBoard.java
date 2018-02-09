package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Noticeboard");
        frame.setPreferredSize(new Dimension(600, 400));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textInput = new JTextField();
        JLabel textOutput = new JLabel();
        JButton copyButton = new JButton("Copy!");
        
        ActionEventListener copier = new ActionEventListener(textInput, textOutput);
        copyButton.addActionListener(copier);
        
        container.add(textInput);
        container.add(copyButton);
        container.add(textOutput);
    }
}
