package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staff_info extends JFrame {
    Staff_info(){



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

        JTable table= new JTable();
        table.setBounds(0,10,680,470);
        table.setBackground( new Color(158, 218, 216));
        panel.add(table);


        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 18));
        back.setBounds(200, 500, 100, 30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });














    }
    static void main(String[] args) {
        new Staff_info();
    }
}
