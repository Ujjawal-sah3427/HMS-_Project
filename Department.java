package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {

    Department(){



        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(158, 218, 216));
        panel.setBounds(10, 10,  780,580);
        add(panel);


        JTable table= new JTable();
        table.setBounds(0,10,680,470);
        table.setBackground( new Color(158, 218, 216));
        panel.add(table);

        JLabel label1 = new JLabel("Department");
        label1.setBounds(20, 30, 200, 30);
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        label1.setBackground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("number");
        label2.setBounds(125, 30, 200, 30);
        label2.setFont(new Font("Tahoma", Font.BOLD, 18));

        label2.setBackground(Color.WHITE);
        panel.add(label2);

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


        try {
            conn c = new conn();
            String q = "SELECT * FROM Departments";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();

        }


        setTitle("UD TEACHING HOSPITAL");
        setSize(800,600);
        setLocation(300,200);
        setLayout(null);
        setFont(new Font("Tahoma",Font.BOLD,20));
        setVisible(true);
    }



    static void main(String[] args) {
        new Department();
    }
}
