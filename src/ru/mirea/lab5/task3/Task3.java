package ru.mirea.lab5.task3;

import javax.swing.*;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(920, 640);
        ImageIcon imageIcon = new ImageIcon(args[0]);
        JLabel pic = new JLabel(imageIcon);
        frame.add(pic);

        frame.setVisible(true);
    }
}

/*
pic1 - C:\InteliJProjects\MIREAProjects\Lab1\src\ru\mirea\lab5\task3\resources\pic1.jpg
pic2 - C:\InteliJProjects\MIREAProjects\Lab1\src\ru\mirea\lab5\task3\resources\pic2.jpg
pic3 - C:\InteliJProjects\MIREAProjects\Lab1\src\ru\mirea\lab5\task3\resources\pic3.jpg
pic4 - C:\InteliJProjects\MIREAProjects\Lab1\src\ru\mirea\lab5\task3\resources\pic4.jpg
pic5 - C:\InteliJProjects\MIREAProjects\Lab1\src\ru\mirea\lab5\task3\resources\pic5.jpg
 */