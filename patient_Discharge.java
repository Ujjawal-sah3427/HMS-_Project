package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class patient_Discharge extends JFrame {
    patient_Discharge(){














        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 18));
        back.setBounds(200, 500, 100, 30);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(158, 218, 216));
        panel.setBounds(10, 10,  780,580);
        add(panel);


        setTitle("UD TEACHING HOSPITAL");
        setSize(800,600);
        setLocation(300,200);
        setLayout(null);
        setFont(new Font("Tahoma",Font.BOLD,20));
        setVisible(true);

    }
    static void main(String[] args) {
        new patient_Discharge();
    }
}
