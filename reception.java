package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class   reception extends JFrame {

    reception()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(158, 187, 218));
        panel.setBounds(5,160,1525,670);
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(80, 184, 207));
        panel1.setBounds(5,5,1525,150);
        add(panel1);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dr.png"));
        Image image =i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i2= new ImageIcon(image);
        JLabel label=new JLabel(i2);
        label.setBounds(1300,0,250,250);
        panel1.add(label);




        ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("icons/amb.png"));
        Image image1 =i11.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT);
        ImageIcon i22= new ImageIcon(image1);
        JLabel label1=new JLabel(i22);
        label1.setBounds(1000,50,300,100);
        panel1.add(label1);


        JButton btn1=new JButton("Add new patient");
        btn1.setBackground(new Color(206, 230, 228, 158));
        btn1.setForeground(Color.BLACK);
        btn1.setBounds(40,15,200,30);
        btn1.setFont(new Font("Tahom",Font.BOLD,12));
        btn1.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new New_patient();

            }
        });

        JButton btn2=new JButton("Room");
        btn2.setBackground(new Color(206, 230, 228, 158));
        btn2.setForeground(Color.BLACK);
        btn2.setBounds(40,65,200,30);
        btn2.setFont(new Font("Tahom",Font.BOLD,12));
        btn2.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();

            }
        });

        JButton btn3=new JButton("Department");
        btn3.setBackground(new Color(206, 230, 228, 158));
        btn3.setForeground(Color.BLACK);
        btn3.setBounds(255,15,200,30);
        btn3.setFont(new Font("Tahom",Font.BOLD,12));
        btn3.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();

            }
        });

        JButton btn4=new JButton("Add_staff");
        btn4.setBackground(new Color(206, 230, 228, 158));
        btn4.setForeground(Color.BLACK);
        btn4.setBounds(255,65,200,30);
        btn4.setFont(new Font("Tahom",Font.BOLD,12));
        btn4.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add_staff();

            }
        });




        JButton btn7=new JButton("patient info");
        btn7.setBackground(new Color(206, 230, 228, 158));
        btn7.setForeground(Color.BLACK);
        btn7.setBounds(460,105,200,30);
        btn7.setFont(new Font("Tahom",Font.BOLD,12));
        panel1.add(btn7);
        btn7.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_info();

            }
        });

        JButton btn8=new JButton(" Staff_info");
        btn8.setBackground(new Color(206, 230, 228, 158));
        btn8.setForeground(Color.BLACK);
        btn8.setBounds(255,105,200,30);
        btn8.setFont(new Font("Tahom",Font.BOLD,12));
        btn8.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Staff_info();


            }
        });
        JButton btn9=new JButton("Patient Discharge");
        btn9.setBackground(new Color(206, 230, 228, 158));
        btn9.setForeground(Color.BLACK);
        btn9.setBounds(40,105,200,30);
        btn9.setFont(new Font("Tahom",Font.BOLD,12));
        btn9.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_Discharge();

            }
        });
        JButton btn10=new JButton("Search Room ");
        btn10.setBackground(new Color(206, 230, 228, 158));
        btn10.setForeground(Color.BLACK);
        btn10.setBounds(460,15,200,30);
        btn10.setFont(new Font("Tahom",Font.BOLD,12));
        btn10.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Search();

            }
        });

        JButton btn11=new JButton("Update ");
        btn11.setBackground(new Color(206, 230, 228, 158));
        btn11.setForeground(Color.BLACK);
        btn11.setBounds(460,65,200,30);
        btn11.setFont(new Font("Tahom",Font.BOLD,12));
        btn11.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn11);
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update();

            }
        });





    JButton btn12=new JButton("logout ");
        btn12.setBackground(new Color(206, 230, 228, 158));
        btn12.setForeground(Color.BLACK);
        btn12.setBounds(670,105,200,30);
        btn12.setFont(new Font("Tahom",Font.BOLD,12));
        btn12.setBorder(BorderFactory.createLineBorder(Color.black ,4));
        panel1.add(btn12);
        btn12.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


        }
    });



        setTitle("UD TEACHING HOSPITAL");
        setSize( 1950, 1050);
        setLocation(10,10);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(109,164,170));
    }
    static void main(String[] args) {
        new reception();
    }
}
