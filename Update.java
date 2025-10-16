package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Update extends JFrame  implements ActionListener{

    Choice choice;

    Update(){


        JLabel label1= new JLabel("Update Patient Details");
        label1.setFont(new Font("Thaoma",Font.BOLD,23));
        label1.setBounds(200,20,300,30);
        label1.setForeground(Color.WHITE);
        add(label1);


        JLabel label2= new JLabel("Name:");
        label2.setFont(new Font("Thaoma",Font.BOLD,23));
        label2.setBounds(50,100,130,30);
        label2.setForeground(Color.BLACK);
        add(label2);

        choice = new Choice();
        choice.setFont(new Font("Tahoma", Font.BOLD, 12));
        choice.setBounds(190, 100, 200, 30);
        add(choice);
         try {
             conn c = new conn();
             ResultSet resultSet= c.statement.executeQuery("select * from  patient_info");
             while (resultSet.next()){
                 choice.add(resultSet.getString("first_name"));

             }
         } catch (Exception e) {
             e.printStackTrace();
         }

        JLabel label3= new JLabel("Room_No:");
        label3.setFont(new Font("Thaoma",Font.BOLD,23));
        label3.setBounds(50,150,200,30);
        label3.setForeground(Color.BLACK);
        add(label3);

        JTextField textFieldR= new JTextField();
        textFieldR.setBounds(190,150,200,30);
        textFieldR.setFont(new Font("Thaoma",Font.BOLD,15));
        add(textFieldR);

        ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("icons/updated.png"));
        Image image1 =i11.getImage().getScaledInstance(240,150,Image.SCALE_DEFAULT);
        ImageIcon i22= new ImageIcon(image1);
        JLabel label5=new JLabel(i22);
        label5.setBounds(430,100,250,200);
        add(label5);






















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
        new Search();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
