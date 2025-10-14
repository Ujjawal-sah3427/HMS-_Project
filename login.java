package hospital.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;


public class login  extends JFrame implements ActionListener {
    JTextField textField;
    JPasswordField passwordField;
    JButton b1,b2;



    login(){

     JLabel nameLabel=new JLabel("Username");
     nameLabel.setFont(new Font("Tahoma",Font.BOLD,15));
     nameLabel.setBounds(100,50,200,30);
     nameLabel.setBackground(Color.BLACK);
     add(nameLabel);


        JLabel password=new JLabel("password");
        password.setFont(new Font("Tahoma",Font.BOLD,15));
        password.setBounds(100,100,200,30);
        password.setBackground(Color.BLACK);
        add(password);
        textField=new JTextField();
        textField.setBounds(200,50,200,30);
        textField.setFont(new Font("Thoma",Font.BOLD,15));
        textField.setBackground(Color.CYAN);
        textField.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        textField.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        add(textField);

        passwordField=new JPasswordField();
        passwordField.setBounds(200,100,200,30);
        passwordField.setFont(new Font("Thoma",Font.BOLD,15));
        passwordField.setBackground(Color.CYAN);
        passwordField.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black ,4));

        add( passwordField);




      ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("icons/logoab.jpg"));
        Image image1 =i11.getImage().getScaledInstance(240,350,Image.SCALE_DEFAULT);
        ImageIcon i22= new ImageIcon(image1);
        JLabel label1=new JLabel(i22);
        label1.setBounds(430,30,250,200);
        add(label1);

        b1= new JButton("login");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Thoma",Font.BOLD,20));
        b1.setBounds(120,200,120,30);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("Reject");
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Thoma",Font.BOLD,20));
        b2.setBounds(250,200,120,30);
        b2.addActionListener(this);
        add(b2);



        setTitle("Hospital management system _ login");
        setSize( 720, 350);
        setLocation(400,250);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(109,164,170));

    }

    static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       if (e.getSource()==b1){
           try{
             conn c=new conn();

               String user=textField.getText();
               String pass=passwordField.getText();



               String q = "select * from login where username='" + user + "' and password='" + pass + "'";
               ResultSet resultSet = c.statement.executeQuery(q);

               if (resultSet.next()){
                   new reception ();
                   setVisible(false);

               }
               else {
                   JOptionPane.showMessageDialog(null,"Invalid: username or password");
               }


           }catch (Exception E){
               E.printStackTrace();
           }

       }else {
           System.exit(10);

           }
    }
}

