package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class ListWindow extends JFrame implements ActionListener {
    JButton exit = new JButton("Назад");
    ListWindow() throws FileNotFoundException {

        exit.setFont(new Font("Preciosa", Font.PLAIN, 20));
        exit.setFocusable(false);
        exit.addActionListener(this);

        JLabel label = new JLabel("Альдерсберг, Амарільо, Ансегіс, Ард Каррайг, Армерія, Ассенгард, Аттре, Ашберг, Аедд Гінваел, Аен Дал");
        label.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label.setForeground(Color.ORANGE);

        JLabel label1 = new JLabel("Бан Ард, Бельхавен, Бен Глеан, Блавікен, Боклер, Бондар, Бремервоорд, Ваттвейр, Венгерберг, Верген");
        label1.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label1.setForeground(Color.ORANGE);

        JLabel label2 = new JLabel("Віковаро, Віроледо, Воле, Ворун, Визіма, Високий міст, Гелібол, Голопілля, Горс Велен, Гробова Бухта");
        label2.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label2.setForeground(Color.ORANGE);

        JLabel label3 = new JLabel("Градобор, Грань Бороса, Гулета, Даевон, Діллінген, Доріан, Дравоград, Друі, Дун Тинне, Задар");
        label3.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label3.setForeground(Color.ORANGE);

        JLabel label4 = new JLabel("Золотий сток, Івало, Іспаден, Ис, Каген, Калькар, Каравіста, Карбон, Каррерас, Кастель Граупіан");
        label4.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label4.setForeground(Color.ORANGE);

        JLabel label5 = new JLabel("Каельф, Каер Трольде, Керак, Клармон, Корво, Крайо, Кралобаг, Крейден, Крінфрід, Лан Ексетер");
        label5.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label5.setForeground(Color.ORANGE);

        JLabel label6 = new JLabel("Лірія, Лок Муінне, Маллеора, Марібор, Мехт, Муррівел, Напейс, Нарок, Нільфгаард, Новіград");
        label6.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label6.setForeground(Color.ORANGE);

        JLabel label7 = new JLabel("Нойнройт, Оксенфурт, Оток, Понт Ваніс, Равелін, Рівія, Рідбрун, Рікверелін, Рінда, Роггевеїн, Cальм");
        label7.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label7.setForeground(Color.ORANGE);

        JLabel label8 = new JLabel("Сарда, Срібні Башти, Тегамо, Тіл, Третогор, Тридам, Трогір, Турн, Тифія, Фано, Флотзам, Форгехам");
        label8.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label8.setForeground(Color.ORANGE);

        JLabel label9 = new JLabel("Хенгфорс, Цидаріс, Цинтра, Егремон, Ейсенлаан, Елландер, Ест Тайяр, Ест Хемлет, Ямурлак, Ярсбор");
        label9.setFont(new Font("Preciosa", Font.PLAIN, 30));
        label9.setForeground(Color.ORANGE);

        this.add(label);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);
        this.add(label9);

        this.setTitle("C.I.T.I.E.S");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1260, 550);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setResizable(false );
        this.setLayout(new FlowLayout());
        this.add(exit);
        this.setLocationRelativeTo(null);

        ImageIcon image = new ImageIcon("city/src/main/java/com/app/resources/wolf.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            this.dispose();
            new WelcomeWindow("Він пропонує випробувати ваші знання міст континенту, приймаєте виклик?");
        }
    }
}