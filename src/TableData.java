import java.awt.*;
import javax.swing.*;

public class TableData extends JFrame {
    JTable TableData;

    TableData() {
        setLayout(new FlowLayout());

        String[] columnName = {"Name", "Eye-Color", "Gender"};

        Object[][] data = {
                {"Bill", "Hazel", "Male"},
                {"Mary", "Black", "Female"},
                {"Rick", "Red", "Male"},
                {"Jeanice", "Yellow", "Female"},
                {"John", "Gold", "Male"}
        };

        TableData = new JTable(data, columnName);
        TableData.setPreferredScrollableViewportSize(new Dimension(500,50));
        TableData.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(TableData);
        add(scrollPane);

       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(600,200);
       setVisible(true);
    }


}
