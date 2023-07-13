package com.app.window;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginWindow("Введіть своє ім'я");
        });
    }
}
