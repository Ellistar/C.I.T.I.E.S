package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;


public class WelcomeWindow extends JFrame implements ActionListener {
    JButton startButton = new JButton("Почати");
    JButton listButton = new JButton("Список");

    WelcomeWindow() {
        JLabel label = new JLabel("Він пропонує випробувати ваші знання міст континенту, приймаєте виклик?");
        label.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label.setForeground(Color.ORANGE);

        startButton.setFont(new Font("Preciosa", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        listButton.setFont(new Font("Preciosa", Font.PLAIN, 20));
        listButton.setFocusable(false);
        listButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.add(label);

        JPanel panelButton = new JPanel();
//       panelButton.setBounds(370,70,100,30);
        panelButton.setBackground(Color.DARK_GRAY);
        panelButton.add(startButton);

        JPanel listButtonPanel = new JPanel();
//        listButtonPanel.setBounds(370,20,100,30);
        listButtonPanel.setBackground(Color.DARK_GRAY);
        listButtonPanel.add(listButton);

        this.setTitle("C.I.T.I.E.S");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(720, 150);
        this.add(panel);
        this.add(panelButton);
        this.add(listButtonPanel);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        ImageIcon image = new ImageIcon("wolf.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listButton) {
            try {
                this.dispose();
                new ListWindow();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource() == startButton) {
            this.dispose();
            new GameWindow();
        }
    }
}
