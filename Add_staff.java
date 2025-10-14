package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Add_staff extends JFrame  implements ActionListener{


    JTextField NameField, IDfield, ageField, emailField, phoneField, addressField,provinceField,disrictField, citizenshipField;
    JComboBox<String> genderCombo;
    JLabel dateLabel;

    JButton addButton,backButton;

    Add_staff(){
        JLabel IDLabel= new JLabel("Staff_ID");
        IDLabel.setFont(new Font("Tahoma",Font.BOLD,15));
        IDLabel.setBounds(50,15,200,30);
        add(IDLabel);
        IDfield =new JTextField();
        IDfield.setBounds(200,10,200,30);
        IDfield.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(IDfield);

        JLabel NameLabel = new JLabel("Name:");
        NameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        NameLabel.setBounds(50, 55, 200, 30);
        add(NameLabel);

        NameField = new JTextField();
       NameField.setBounds(200, 55, 200, 30);
       NameField.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(NameField);


        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        genderLabel.setBounds(50, 95, 200, 30);
        add(genderLabel);

        genderCombo = new JComboBox<>(new String[]{"Male", "Female", "Others"});
        genderCombo.setBounds(200, 95, 200, 30);
        genderCombo.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(genderCombo);

        JLabel addressLabel= new JLabel("Address:");
        addressLabel.setFont(new Font("Thoma",Font.BOLD,15));
        addressLabel.setBounds(50,135,200,30);
        add(addressLabel);
        addressField= new JTextField();
        addressField.setBounds(200,135,200,30);
        addressField.setFont(new Font("Tahoma",Font.BOLD,15));
        add(addressField);

        JLabel CitizenshipLabel= new JLabel("Citizenship_ID");
        CitizenshipLabel.setBounds(50,175,200,30);
        CitizenshipLabel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(CitizenshipLabel);

        citizenshipField = new JTextField();
        citizenshipField.setBounds(200,175,200,30);
        citizenshipField.setFont(new Font("Tahoma",Font.BOLD,15));
        add(citizenshipField);

        JLabel PhoneLabel= new JLabel("Phone no:");
        PhoneLabel.setFont(new Font("Thaoma",Font.BOLD,15));
        PhoneLabel.setBounds(50,210,200,30);
        add(PhoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(200,210,200,30);
        phoneField.setFont(new Font("Tahoma",Font.BOLD,15));
        add(phoneField);

        JLabel EmailLabel= new JLabel("Email:");
        EmailLabel.setBounds(50,255,200,30);
        EmailLabel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(EmailLabel);

        emailField=new JTextField();
        emailField.setFont(new Font("Tahoma",Font.BOLD,15));
        emailField.setBounds(200,255,200,30);
        add(emailField);

        JLabel Agelabel= new JLabel("Staff_age");
        Agelabel.setFont(new Font("Tahoma",Font.BOLD,15));
        Agelabel.setBounds(50,295,200,30);
        add(Agelabel);

        ageField= new JTextField();
        ageField.setFont(new Font("Tahoma",Font.BOLD,15));
        ageField.setBounds(200,295,200,30);
        add(ageField);

        JLabel ProvinceLabel= new JLabel("Province:");
        ProvinceLabel.setFont(new Font("Tahoma",Font.BOLD,15));
        ProvinceLabel.setBounds(50,335,200,30);
        add(ProvinceLabel);

        provinceField= new JTextField();
        provinceField.setFont(new Font("Tahoma",Font.BOLD,15));
        provinceField.setBounds(200,335,200,30);
        add(provinceField);

        JLabel DistrictLabel= new JLabel("District:");
        DistrictLabel.setFont(new Font("Tahoma",Font.BOLD,15));
        DistrictLabel.setBounds(50,375,200,30);
        add(DistrictLabel);

        disrictField= new JTextField();
        disrictField.setFont(new Font("Tahoma",Font.BOLD,15));
        disrictField.setBounds(200,375,200,30);
        add( disrictField);

        JLabel DateLabel = new JLabel("Date");
        DateLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        DateLabel.setBounds(50, 420, 200, 30);
        add(DateLabel);



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

        //  Buttons
        addButton = new JButton("ADD");
        addButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        addButton.setBounds(80, 480, 120, 30);
        addButton.setBackground(Color.BLUE);
        addButton.setForeground(Color.WHITE);
        addButton.addActionListener(this);
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        backButton.setBounds(250, 480, 120, 30);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        add(backButton);
    }
    static void main(String[] args) {
        new Add_staff();
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        if (e.getSource() == addButton) {

            String Staff_ID = IDfield.getText();
            String name = NameField.getText();
            String Gender = (String) genderCombo.getSelectedItem();
            String Address = addressField.getText();
            String Citizenship_ID= citizenshipField.getText();
            String phone = phoneField.getText();
            String Email = emailField.getText();
            String staff_age = ageField.getText();
            String province = provinceField.getText();
            String District= disrictField.getText();
            String Date = dateLabel.getText();

            try {
                conn c = new conn();
                String q = "INSERT INTO staff_info (Staff_ID, name,  Gender, Address, Citizenship_ID,phone_no,Email,staff_age,provience,District,Date ) VALUES " +
                        "('" + Staff_ID + "', '" + name + "', '" +Gender + "', '" + Address + "', '" + Citizenship_ID  + "', '" + phone + "', '" + Email + "', '" + staff_age + "', '" + province + "', '" + District + "' , '" + Date + "')";

                c.statement.executeUpdate(q);
          ;
                JOptionPane.showMessageDialog(null, "Staff Added Successfully");
                setVisible(false);

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }

        } else if (e.getSource() == backButton) {
            setVisible(false);
        }
























    }
}
