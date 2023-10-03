package ru.mirea.lab16.task2;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {
    private final JTextArea textArea;

    public Task2() {
        setTitle("Простой текстовый редактор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Цвет");
        JMenu fontMenu = new JMenu("Шрифт");

        ButtonGroup colorGroup = new ButtonGroup();
        ButtonGroup fontGroup = new ButtonGroup();

        JRadioButtonMenuItem blueItem = new JRadioButtonMenuItem("Синий");
        JRadioButtonMenuItem redItem = new JRadioButtonMenuItem("Красный");
        JRadioButtonMenuItem blackItem = new JRadioButtonMenuItem("Черный");

        JRadioButtonMenuItem timesNewRomanItem = new JRadioButtonMenuItem("Times New Roman");
        JRadioButtonMenuItem msSansSerifItem = new JRadioButtonMenuItem("MS Sans serif");
        JRadioButtonMenuItem courierNewItem = new JRadioButtonMenuItem("Courier New");

        colorGroup.add(blueItem);
        colorGroup.add(redItem);
        colorGroup.add(blackItem);

        fontGroup.add(timesNewRomanItem);
        fontGroup.add(msSansSerifItem);
        fontGroup.add(courierNewItem);

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        timesNewRomanItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        msSansSerifItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14)));
        courierNewItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));

        blackItem.setSelected(true);
        timesNewRomanItem.setSelected(true);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task2::new);
    }
}
