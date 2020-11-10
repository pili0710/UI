import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorChooser extends JFrame {

    colorChooser() {
        JButton b = new JButton("SELECT");
        b.setBounds(20,10,150,30);
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color initial=Color.RED;
                java.awt.Color initialcolor = Color.RED;
                java.awt.Color clr = JColorChooser.showDialog(null, "choose", initialcolor);
                b.setBackground(clr);
            }
        });

        setVisible(true);
    }



}
