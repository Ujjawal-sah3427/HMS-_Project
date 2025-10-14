package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class New_patient extends JFrame implements ActionListener {
    JTextField firstNameField, lastNameField, ageField, emailField, phoneField, addressField, diseaseField;
    JComboBox<String> genderCombo;
    JLabel dateLabel;
    Choice roomChoice;
    JButton addButton, backButton;

    public New_patient() {


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(158, 218, 216));
        panel.setBounds(20, 10, 900, 600);
        add(panel);

        JLabel titleLabel = new JLabel("** PATIENT FORM **");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
        titleLabel.setBounds(300, 5, 400, 30);
        panel.add(titleLabel);

        // 🟡 First Name
        JLabel fNameLabel = new JLabel("First Name");
        fNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        fNameLabel.setBounds(50, 50, 200, 30);
        panel.add(fNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(270, 50, 200, 30);
        styleTextField(firstNameField);
        panel.add(firstNameField);

        // 🟡 Last Name
        JLabel lNameLabel = new JLabel("Last Name");
        lNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lNameLabel.setBounds(50, 90, 200, 30);
        panel.add(lNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(270, 90, 200, 30);
        styleTextField(lastNameField);
        panel.add(lastNameField);

        //  Date / Time
        JLabel timeLabel = new JLabel("Time");
        timeLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        timeLabel.setBounds(50, 130, 200, 30);
        panel.add(timeLabel);

        dateLabel = new JLabel("" + new Date());
        dateLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        dateLabel.setBounds(270, 130, 300, 30);
        panel.add(dateLabel);

        //  Gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        genderLabel.setBounds(50, 170, 200, 30);
        panel.add(genderLabel);

        genderCombo = new JComboBox<>(new String[]{"Male", "Female", "Others"});
        genderCombo.setBounds(270, 170, 200, 30);
        genderCombo.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(genderCombo);

        // Age
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        ageLabel.setBounds(50, 210, 200, 30);
        panel.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(270, 210, 200, 30);
        styleTextField(ageField);
        panel.add(ageField);

        //  Email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        emailLabel.setBounds(50, 250, 200, 30);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(270, 250, 200, 30);
        styleTextField(emailField);
        panel.add(emailField);

        //  Phone Number
        JLabel phoneLabel = new JLabel("Phone Number");
        phoneLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        phoneLabel.setBounds(50, 290, 200, 30);
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(270, 290, 200, 30);
        styleTextField(phoneField);
        panel.add(phoneField);

        // Address
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        addressLabel.setBounds(50, 330, 200, 30);
        panel.add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(270, 330, 200, 30);
        styleTextField(addressField);
        panel.add(addressField);

        //  Disease
        JLabel diseaseLabel = new JLabel("Disease");
        diseaseLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        diseaseLabel.setBounds(50, 370, 200, 30);
        panel.add(diseaseLabel);

        diseaseField = new JTextField();
        diseaseField.setBounds(270, 370, 200, 30);
        styleTextField(diseaseField);
        panel.add(diseaseField);

        //  Room
        JLabel roomLabel = new JLabel("Room");
        roomLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        roomLabel.setBounds(50, 410, 200, 30);
        panel.add(roomLabel);

        roomChoice = new Choice();
        try {
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM Rooms WHERE availability='Available'");
            while (rs.next()) {
                roomChoice.add(rs.getString("room_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        roomChoice.setBounds(270, 415, 200, 30);
        panel.add(roomChoice);

        //  Buttons
        addButton = new JButton("ADD");
        addButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        addButton.setBounds(80, 480, 120, 30);
        addButton.setBackground(Color.BLUE);
        addButton.setForeground(Color.WHITE);
        addButton.addActionListener(this);
        panel.add(addButton);

        backButton = new JButton("BACK");
        backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        backButton.setBounds(250, 480, 120, 30);
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        panel.add(backButton);

        //  Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/patient.png"));
        Image img = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(img);
        JLabel imageLabel = new JLabel(i2);
        imageLabel.setBounds(520, 150, 250, 250);
        panel.add(imageLabel);

        // main
        setTitle("UD TEACHING HOSPITAL");
        setSize(1050, 700);
        setBounds(10, 50, 1001, 650);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
    }

    // Helper method for text field styling
    private void styleTextField(JTextField field) {
        field.setFont(new Font("Tahoma", Font.BOLD, 15));
        field.setBackground(Color.CYAN);
        field.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    }

    // 🟡 Main method
    public static void main(String[] args) {
        new New_patient();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {

            String firstname = firstNameField.getText();
            String lastname = lastNameField.getText();
            String date = dateLabel.getText();
            String gender = (String) genderCombo.getSelectedItem();
            String age = ageField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String disease = diseaseField.getText();
            String room = roomChoice.getSelectedItem();

            try {
                conn c = new conn();
                String q = "INSERT INTO patient_info (firstname, lastname, date, gender, age, email, phone, address, disease, room) VALUES " +
                        "('" + firstname + "', '" + lastname + "', '" + date + "', '" + gender + "', '" + age + "', '" + email + "', '" + phone + "', '" + address + "', '" + disease + "', '" + room + "')";
                String q1 = "UPDATE Rooms SET availability='Occupied' WHERE room_no="+ room  ;

                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);

                JOptionPane.showMessageDialog(null, "Patient Added Successfully");
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
