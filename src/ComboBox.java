import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {
    JComboBox comboBox;

    ComboBox() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
         comboBox = new JComboBox(animals);
         comboBox.addActionListener(this);
        add(comboBox);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){

        }
    }
}
