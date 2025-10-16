package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class Search extends JFrame {

    Choice choice;
    JTable table;

    Search() {
        setTitle("UD TEACHING HOSPITAL");
        setSize(800, 600);
        setLocation(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(158, 218, 216));
        panel.setBounds(0, 0, 780, 580);
        add(panel);

        // Header
        JLabel searchfor = new JLabel("Search for Room");
        searchfor.setBounds(250, 20, 300, 30);
        searchfor.setFont(new Font("Tahoma", Font.BOLD, 20));
        searchfor.setForeground(Color.WHITE);
        panel.add(searchfor);

        // Status label
        JLabel status = new JLabel("Status:");
        status.setBounds(50, 60, 100, 30);
        status.setFont(new Font("Tahoma", Font.BOLD, 15));
        status.setForeground(Color.WHITE);
        panel.add(status);


        choice = new Choice();
        choice.setFont(new Font("Tahoma", Font.BOLD, 12));
        choice.setBounds(180, 60, 200, 30);
        choice.add("available");
        choice.add("occupied");
        panel.add(choice);


        JLabel label1 = new JLabel("Room No");
        label1.setBounds(20, 90, 100, 20);
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        label1.setForeground(Color.BLACK);
        panel.add(label1);

        JLabel label2 = new JLabel("Availability");
        label2.setBounds(135, 90, 150, 20);
        label2.setFont(new Font("Tahoma", Font.BOLD, 18));
        label2.setForeground(Color.BLACK);
        panel.add(label2);

        JLabel label3 = new JLabel("Price");
        label3.setBounds(290, 90, 100, 20);
        label3.setFont(new Font("Tahoma", Font.BOLD, 18));
        label3.setForeground(Color.BLACK);
        panel.add(label3);

        JLabel label4 = new JLabel("Room Type");
        label4.setBounds(410, 90, 150, 20);
        label4.setFont(new Font("Tahoma", Font.BOLD, 18));
        label4.setForeground(Color.BLACK);
        panel.add(label4);




      JTable table= new JTable();
      table.setFont(new Font("Thaoma",Font.BOLD,15));
      table.setBounds(10,120,780,500);
      panel.add(table);


        try {
            conn c = new conn();
            String q = "SELECT * FROM Rooms";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }


        JButton searchBtn = new JButton("Search");
        searchBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
        searchBtn.setBackground(Color.BLACK);
        searchBtn.setForeground(Color.WHITE);
        searchBtn.setBounds(330, 520, 100, 30);
        panel.add(searchBtn);

        searchBtn.addActionListener((ActionEvent e) -> {
            String q = "SELECT * FROM Rooms WHERE availability='" + choice.getSelectedItem() + "'";
            try {
                conn c = new conn();
                ResultSet resultSet = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 18));
        back.setBounds(200, 520, 100, 30);
        add(back);

        back.addActionListener((ActionEvent e) -> setVisible(false));

        setVisible(true);
    }

    public static void main(String[] args) {
        new Search();
    }
}
