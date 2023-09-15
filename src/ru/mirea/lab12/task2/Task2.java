package ru.mirea.lab12.task2;

import ru.mirea.lab5.task2.Draw;

import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(920, 640);

        ru.mirea.lab5.task2.Draw draw = new Draw();
        frame.add(draw);

        draw.drawing();
    }
}
