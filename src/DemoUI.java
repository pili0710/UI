import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoUI extends JFrame {
    JLabel label;
    public DemoUI() {
        setTitle("Demo Application");
        setSize(275, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("This is Java Swing.");
        add(label);

        JButton btnA = new JButton("Button A");
        JButton btnB = new JButton("Button B");
        JButton btnC = new JButton("Button C");

        add(btnA);
        add(btnB);
        add(btnC);

        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button A Pressed.");
                JOptionPane.showMessageDialog(null, "Button A!!!");
            }

        });

        btnB.addActionListener(new ButtonBListener());


        setVisible(true);
    }

    //inner class
    class ButtonBListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button B Pressed.");
            JOptionPane.showMessageDialog(null, "Button B   !!!");
        }
    }
    class ButtonCListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new InputUI();
        }
    }

}
