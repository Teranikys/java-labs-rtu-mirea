package ru.mirea.lab15.task2;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {
    public Task2() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel menuPanel = new JPanel();
        JComboBox<String> menuComboBox = new JComboBox<>();
        menuComboBox.addItem("Australia");
        menuComboBox.addItem("China");
        menuComboBox.addItem("England");
        menuComboBox.addItem("Russia");
        menuPanel.add(menuComboBox);
        setLayout(new BorderLayout());
        add(menuPanel, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task2::new);
    }
}
