import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPane extends JFrame {


    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    String[] animals = {"dog", "cat", "bird", "tiger", "squirrel", "mosquito", "dinosaur"};
    JComboBox combBox = new JComboBox(animals);

    JTable tabdata = new JTable();

    JLabel label1 = new JLabel("Ini Adalah ComboBox:  ");
    JLabel label2 = new JLabel("Second!");
    JLabel label3 = new JLabel("Third!");

    JTabbedPane tabbedPane = new JTabbedPane();

    public TabbedPane() {
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        String[] columnName = {"Name", "Eye-Color", "Gender"};

        Object[][] data = {
                {"Bill", "Hazel", "Male"},
                {"Mary", "Black", "Female"},
                {"Rick", "Red", "Male"},
                {"Jeanice", "Yellow", "Female"},
                {"John", "Gold", "Male"}
        };

        tabdata = new JTable(data,columnName);
        tabdata.setPreferredScrollableViewportSize(new Dimension(500,50));
        tabdata.setFillsViewportHeight(true);



        JButton b = new JButton("SELECT");
        b.setBounds(20,10,150,30);
        add(b, BorderLayout.CENTER);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color initial=Color.RED;
                java.awt.Color initialcolor = Color.RED;
                java.awt.Color clr = JColorChooser.showDialog(null, "choose", initialcolor);
                b.setBackground(clr);

            }
        });

        panel1.add(label1);
        panel1.add(combBox);


        panel2.add(tabdata);


        panel3.add(b);

        tabbedPane.add("ComboBox", panel1);
        tabbedPane.add("Table", panel2);
        tabbedPane.add("Color Chooser", panel3);
        add(tabbedPane);

        setVisible(true);
    }



}

