import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class InputUI extends JFrame {
    JTextField txtNama;
    JCheckBox cbSD, cbSMP, cbSMA, cbS1;
    JRadioButton rdLaki, rdPerempuan;
    ButtonGroup bgJenisKelamin;
    JButton btnSave, btnClose;
    JToggleButton btnSubscribe;

    public InputUI() {
        setTitle("User Input");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.LEADING));
        txtNama = new JTextField(15);
        cbSD = new JCheckBox("SD");
        cbSMP = new JCheckBox("SMP");
        cbSMA = new JCheckBox("SMA");
        cbS1 = new JCheckBox("S1");

        rdLaki = new JRadioButton("Laki-Laki");
        rdPerempuan = new JRadioButton("Perempuan");

        bgJenisKelamin = new ButtonGroup();
        bgJenisKelamin.add(rdLaki);
        bgJenisKelamin.add(rdPerempuan);

        btnSubscribe = new JToggleButton("No");
        btnSave = new JButton("Save");
        btnClose = new JButton("Close");

        add(new JLabel("Nama Lengkap: "));
        add(txtNama);
        add((new JLabel("Pendidikan yang sudah ditempih: ")));
        add(cbSD);
        add(cbSMP);
        add(cbSMA);
        add(cbS1);

        add((new JLabel("Jenis Kelamin: ")));
        add((rdLaki));
        add(rdPerempuan);

        add(new JLabel("Apakah anda mau subscribe ke newsletter ini? "));
        add(btnSubscribe);

        add(new JLabel("Apakah anda mau menyimpam?"));
        add(btnSave);
        add(btnClose);

        btnSubscribe.addItemListener(new ToggleListener());
        btnSave.addActionListener(new SaveListener());
        btnClose.addActionListener(new CloseListener());
        setVisible(true);
    }
    class ToggleListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (btnSubscribe.isSelected())
                btnSubscribe.setText("Yes");
            else
                btnSubscribe.setText("No");
        }
    }
    class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null , "Saved");
        }
    }
    class CloseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
}
