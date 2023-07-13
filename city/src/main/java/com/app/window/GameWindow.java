package com.app.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameWindow extends JFrame implements ActionListener {

    private char lastLetter = ' ';
    private final String computer = "Відьмак: ";
    private final String scoreText = "Ваш рахунок: ";
    private final JTextField textField;
    private final JLabel label1;
    private final JLabel label2;
    private final List<String> cities = new ArrayList<>();
    private final List<String> usedCities = new ArrayList<>();
    private final Random random = new Random();
    private int score = 0;
    private boolean userTurn = true;

    GameWindow(String note) {
        cities.add("Альдерсберг");
        cities.add("Амарільо");
        cities.add("Ансегіс");
        cities.add("Ард Каррайг");
        cities.add("Армерія");
        cities.add("Ассенгард");
        cities.add("Аттре");
        cities.add("Ашберг");
        cities.add("Аедд Гінваел");
        cities.add("Аен Дал");
        cities.add("Бан Ард");
        cities.add("Бельхавен");
        cities.add("Бен Глеан");
        cities.add("Блавікен");
        cities.add("Боклер");
        cities.add("Бондар");
        cities.add("Бремервоорд");
        cities.add("Ваттвейр");
        cities.add("Венгерберг");
        cities.add("Верген");
        cities.add("Віковаро");
        cities.add("Віроледо");
        cities.add("Воле");
        cities.add("Ворун");
        cities.add("Визіма");
        cities.add("Високий міст");
        cities.add("Гелібол");
        cities.add("Голопілля");
        cities.add("Горс Велен");
        cities.add("Гробова Бухта");
        cities.add("Градобор");
        cities.add("Грань Бороса");
        cities.add("Гулета");
        cities.add("Даевон");
        cities.add("Діллінген");
        cities.add("Доріан");
        cities.add("Дравоград");
        cities.add("Друі");
        cities.add("Дун Тинне");
        cities.add("Задар");
        cities.add("Золотий сток");
        cities.add("Івало");
        cities.add("Іспаден");
        cities.add("Ис");
        cities.add("Каген");
        cities.add("Калькар");
        cities.add("Каравіста");
        cities.add("Карбон");
        cities.add("Каррерас");
        cities.add("Кастель Граупіан");
        cities.add("Каельф");
        cities.add("Каер Трольде");
        cities.add("Керак");
        cities.add("Клармон");
        cities.add("Корво");
        cities.add("Крайо");
        cities.add("Кралобаг");
        cities.add("Крейден");
        cities.add("Крінфрід");
        cities.add("Лан Ексетер");
        cities.add("Лірія");
        cities.add("Лок Муінне");
        cities.add("Маллеора");
        cities.add("Марібор");
        cities.add("Мехт");
        cities.add("Муррівел");
        cities.add("Напейс");
        cities.add("Нарок");
        cities.add("Нільфгаард");
        cities.add("Новіград");
        cities.add("Нойнройт");
        cities.add("Оксенфурт");
        cities.add("Оток");
        cities.add("Понт Ваніс");
        cities.add("Равелін");
        cities.add("Рівія");
        cities.add("Рідбрун");
        cities.add("Рікверелін");
        cities.add("Рінда");
        cities.add("Роггевеїн");
        cities.add("Сальм");
        cities.add("Сарда");
        cities.add("Срібні Башти");
        cities.add("Тегамо");
        cities.add("Тіл");
        cities.add("Третогор");
        cities.add("Тридам");
        cities.add("Трогір");
        cities.add("Турн");
        cities.add("Тифія");
        cities.add("Фано");
        cities.add("Флотзам");
        cities.add("Форгехам");
        cities.add("Хенгфорс");
        cities.add("Цидаріс");
        cities.add("Цинтра");
        cities.add("Егремон");
        cities.add("Ейсенлаан");
        cities.add("Елландер");
        cities.add("Ест Тайяр");
        cities.add("Ест Хемлет");
        cities.add("Ямурлак");
        cities.add("Ярсбор");


        JLabel label = new JLabel(note);
        label.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label.setForeground(Color.ORANGE);
        label.setLayout(new FlowLayout());

        label1 = new JLabel(computer);
        label1.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label1.setForeground(Color.ORANGE);
        label1.setLayout(new FlowLayout());

        label2 = new JLabel(scoreText + score);
        label2.setFont(new Font("Preciosa", Font.PLAIN, 25));
        label2.setForeground(Color.ORANGE);
        label2.setLayout(new FlowLayout());

        JButton submit = new JButton("Зробити хід");
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

    private boolean isCityUsed(String city) {
        return !usedCities.contains(city.toLowerCase());
    }

    private boolean isValidCity(String city) {
        for (String validCity : cities) {
            if (validCity.equalsIgnoreCase(city)) {
                return true;
            }
        }
        return false;
    }

    private String getRandomCity(List<String> cities) {
        List<String> availableCities = new ArrayList<>();

        for (String city : cities) {
            if (isCityUsed(city) &&isLastLetterMatch(city)) {
                availableCities.add(city);
            }
        }

        if (availableCities.isEmpty()) {
            return null;
        }

        int index = random.nextInt(availableCities.size());
        return availableCities.get(index);
    }

    private void updateScore() {
        label2.setText(scoreText + score);
    }

    private boolean isLastLetterMatch(String word) {
        if (lastLetter == ' ') {
            // Якщо це перший хід, то будь-яке слово приймається
            return true;
        }

        char firstChar = Character.toLowerCase(word.charAt(0));
        char lastChar = Character.toLowerCase(lastLetter);

        return firstChar == lastChar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String answer = textField.getText();
        if (answer.equals("здаюсь")) {
            JOptionPane.showMessageDialog(null, "Гра завершена. Рахунок гравця "+ LoginWindow.USERNAME +": " + score, "Кінець гри", JOptionPane.INFORMATION_MESSAGE);
            dispose(); // Закриття поточного вікна гри
            new WelcomeWindow("Бажаєте спробувати ще раз?"); // Відкриття вікна "з вибором"
        } else if (answer.length() == 0) {
            JOptionPane.showMessageDialog(null, "Введіть назву міста!", "Помилка", JOptionPane.ERROR_MESSAGE);
        } else {
            String validCity = null;
            if (isValidCity(answer) && isCityUsed(answer) && isLastLetterMatch(answer)) {
                validCity = answer;
                usedCities.add(validCity.toLowerCase());
                lastLetter = validCity.charAt(validCity.length() - 1);
                score++;
                updateScore();
            } else {
                JOptionPane.showMessageDialog(null, "Літери не сходяться!", "Помилка", JOptionPane.ERROR_MESSAGE);
            }
            if (userTurn && validCity != null) {
                String computerCity = getRandomCity(cities);
                if (computerCity != null) {
                    label1.setText(computer + computerCity);
                    lastLetter = computerCity.charAt(computerCity.length() - 1);
                    usedCities.add(computerCity.toLowerCase());
                    userTurn = true; // Переключення черги ходів
                } else {
                    JOptionPane.showMessageDialog(null, "Ви перемогли! Рахунок гравця "+ LoginWindow.USERNAME +": " + score, "Кінець гри", JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Закриття поточного вікна гри
                    new WelcomeWindow("Бажаєте спробувати ще раз?"); // Відкриття вікна "з вибором"
                }
            } else if (!userTurn && validCity != null) {
                userTurn = true; // Переключення черги ходів
            }
        }
        textField.setText("");
    }
}