package com.app.window;

import javax.swing.*;

public class FirstEncounterFrame extends JOptionPane {
    FirstEncounterFrame(){
       int answer = JOptionPane.showConfirmDialog(null, "Ви - відьмак, який повертається в Каер Морхен після виконання складного замовлення на циклопа біля Новіграда. \nПо дорозі ви зустрічаєте ще одного відьмака, що прямує до найближчого лісу у пошуках монстрів. Ви підходите до нього.", "зустріч", JOptionPane.DEFAULT_OPTION);
        if (answer == 0) {
           new WelcomeWindow("Він пропонує випробувати ваші знання міст континенту, приймаєте виклик?");
       }
    }
}
