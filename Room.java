package hospital.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {

    JTable table;

    Room() {
        setTitle("UD TEACHING HOSPITAL");
        setSize(900, 700);
        setLocation(300,200);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(90, 156, 163));
        panel.setBounds(5, 5, 870, 650);
        add(panel);


        table = new JTable();
        table.setBackground(new Color(148, 236, 227));
        table. setBounds(5,5,500,400);



        JLabel label1 = new JLabel("Room No");
        label1.setBounds(20, 30, 100, 30);
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Availability");
        label2.setBounds(125, 30, 150, 30);
        label2.setFont(new Font("Tahoma", Font.BOLD, 18));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3 = new JLabel("Price");
        label3.setBounds(260, 30, 100, 30);
        label3.setFont(new Font("Tahoma", Font.BOLD, 18));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4 = new JLabel("Room Type");
        label4.setBounds(380, 30, 150, 30);
        label4.setFont(new Font("Tahoma", Font.BOLD, 18));
        label4.setForeground(Color.WHITE);
        panel.add(label4);



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
            String q = "SELECT * FROM Rooms";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();

        }

        setVisible(true);
    }



    public static void main(String[] args) {
        new Room();
    }
}
