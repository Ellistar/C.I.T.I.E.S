package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {
    String note = "Введіть назву міста";
    String computer = "Мандрівник: ";
    JButton submit;
    JTextField textField;
    JLabel label;
    JLabel label1;

    GameWindow() {
        this.setTitle("C.I.T.I.E.S");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(550, 150);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        label = new JLabel(note);
        label.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label.setForeground(Color.ORANGE);
        label.setLayout(new FlowLayout());

        label1 = new JLabel(computer);
        label1.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label1.setForeground(Color.ORANGE);
        label1.setLayout(new FlowLayout());

        submit = new JButton("Зробити хід");
        submit.setFont(new Font("Preciosa", Font.BOLD, 20));
        submit.setFocusable(false);
        submit.addActionListener(this);

        textField = new JTextField();
        textField.setFont(new Font("Preciosa", Font.BOLD, 25));
        textField.setForeground(Color.ORANGE);
        textField.setBackground(Color.GRAY);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(15, 15, 150, 30);
        panel.setLayout(new BorderLayout());
        panel.add(textField);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.PINK);
        panel2.setBounds(15, 60, 150, 30);
        panel2.setLayout(new BorderLayout());
        panel2.add(submit);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.DARK_GRAY);
        panel3.setBounds(200, 15, 200, 30);
        panel3.setLayout(new BorderLayout());
        panel3.add(label);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.DARK_GRAY);
        panel4.setBounds(200, 60, 330, 30);
        panel4.setLayout(new BorderLayout());
        panel4.add(label1);


        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);

        ImageIcon image = new ImageIcon("wolf.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String answer = textField.getText();
       if(answer.equals("здаюсь")) {
           this.dispose();
           new WelcomeWindow();
        }
    }
}

