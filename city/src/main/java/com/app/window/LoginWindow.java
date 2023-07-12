package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame implements ActionListener {
    JButton submit;
    JTextField login;
    String name = "";
    JLabel label;
    LoginWindow(String welcomeFraze) {

        label = new JLabel(welcomeFraze);
        label.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label.setForeground(Color.ORANGE);

        login = new JTextField();
        login.setFont(new Font("Preciosa", Font.BOLD, 25));
        login.setForeground(Color.ORANGE);
        login.setBackground(Color.GRAY);

        submit = new JButton("Продовжити");
        submit.setFont(new Font("Preciosa", Font.BOLD, 20));
        submit.setFocusable(false);
        submit.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(200, 30, 150, 30);
        panel.setLayout(new BorderLayout());
        panel.add(login);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setBounds(15, 30, 200, 30);
        panel1.setLayout(new BorderLayout());
        panel1.add(label);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.PINK);
        panel2.setBounds(120, 100, 150, 30);
        panel2.setLayout(new BorderLayout());
        panel2.add(submit);

        this.add(panel);
        this.add(panel1);
        this.add(panel2);

        this.setTitle("C.I.T.I.E.S");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(400, 200);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("city/src/main/java/com/app/resources/wolf.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         name = login.getText();
        if (name.length() == 0) {
            this.dispose();
            new LoginWindow("Спробуйте ще раз");
        } else {
            this.dispose();
            new FirstEncounterFrame();
        }
    }
}
