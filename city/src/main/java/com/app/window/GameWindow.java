package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {
    String computer = "Відьмак: ";
    String score = "Ваш рахунок: ";
    JButton submit;
    JTextField textField;
    JLabel label;
    JLabel label1;
    JLabel label2;

    GameWindow(String note) {

        label = new JLabel(note);
        label.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label.setForeground(Color.ORANGE);
        label.setLayout(new FlowLayout());

        label1 = new JLabel(computer);
        label1.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label1.setForeground(Color.ORANGE);
        label1.setLayout(new FlowLayout());

        label2 = new JLabel(score);
        label2.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label2.setForeground(Color.ORANGE);
        label2.setLayout(new FlowLayout());

        submit = new JButton("Зробити хід");
        submit.setFont(new Font("Preciosa", Font.BOLD, 20));
        submit.setFocusable(false);
        submit.addActionListener(this);

        textField = new JTextField();
        textField.setFont(new Font("Preciosa", Font.BOLD, 25));
        textField.setForeground(Color.ORANGE);
        textField.setBackground(Color.GRAY);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(15, 15, 150, 30);
        panel.setLayout(new BorderLayout());
        panel.add(textField);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);
        panel2.setBounds(15, 60, 150, 30);
        panel2.setLayout(new BorderLayout());
        panel2.add(submit);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.DARK_GRAY);
        panel3.setBounds(200, 15, 330, 30);
        panel3.setLayout(new BorderLayout());
        panel3.add(label);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.DARK_GRAY);
        panel4.setBounds(200, 60, 330, 30);
        panel4.setLayout(new BorderLayout());
        panel4.add(label1);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.DARK_GRAY);
        panel5.setBounds(15, 105, 300, 30);
        panel5.setLayout(new BorderLayout());
        panel5.add(label2);

        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);

        this.setTitle("C.I.T.I.E.S");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(550, 200);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("city/src/main/java/com/app/resources/wolf.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String answer = textField.getText();
       if(answer.equals("здаюсь")) {
           this.dispose();
           new WelcomeWindow("(ім'я), набрали .../... балів, бажаєте зіграти ще раз?");
        } else if (answer.length() == 0) {
           this.dispose();
           new GameWindow("Такого міста не існує");
       }
    }
}

