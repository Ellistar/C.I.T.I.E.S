package com.app.window;

import javax.swing.*;

public class FirstEncounterFrame extends JOptionPane {
    FirstEncounterFrame(){
       int answer = JOptionPane.showConfirmDialog(null, "Проходячи повз таверни вас зупиняє мандрівник", "зустріч", JOptionPane.PLAIN_MESSAGE);
        if (answer == 0) {
           new WelcomeWindow();
       }
    }
}
