package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;


public class WelcomeWindow extends JFrame implements ActionListener {
    JButton startButton = new JButton("Почати");
    JButton listButton = new JButton("Список");

    WelcomeWindow(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label.setForeground(Color.ORANGE);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        startButton.setFont(new Font("Preciosa", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        listButton.setFont(new Font("Preciosa", Font.PLAIN, 20));
        listButton.setFocusable(false);
        listButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(15, 15, 750, 30);
        panel.setLayout(new BorderLayout());
        panel.add(label);

        JPanel panelButton = new JPanel();
        panelButton.setBackground(Color.DARK_GRAY);
        panelButton.setBounds(230, 60, 150, 30);
        panelButton.setLayout(new BorderLayout());
        panelButton.add(startButton);

        JPanel listButtonPanel = new JPanel();
        listButtonPanel.setBackground(Color.DARK_GRAY);
        listButtonPanel.setBounds(430, 60, 150, 30);
        listButtonPanel.setLayout(new BorderLayout());
        listButtonPanel.add(listButton);

        this.add(panel);
        this.add(panelButton);
        this.add(listButtonPanel);

        this.setTitle("C.I.T.I.E.S");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 150);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("city/src/main/java/com/app/resources/wolf.jpg");
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
            new GameWindow("Введіть назву міста");
        }
    }
}