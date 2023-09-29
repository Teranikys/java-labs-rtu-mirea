package ru.mirea.lab15.task3;

import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {

    private final JTextArea textArea;

    public Task3() {
        setTitle("Меню и кнопки");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        JMenuBar menuBar = getjMenuBar();
        setJMenuBar(menuBar);

        JPanel buttonPanel = getButtonPanel();

        textArea = new JTextArea(10, 30);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel getButtonPanel() {
        JPanel buttonPanel = new JPanel();

        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");

        button1.addActionListener(e -> textArea.append("Нажата кнопка 1\n"));
        button2.addActionListener(e -> textArea.append("Нажата кнопка 2\n"));

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        return buttonPanel;
    }

    private JMenuBar getjMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = getFileMenu();
        JMenu editMenu = getEditMenu();
        JMenu helpMenu = new JMenu("Справка");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        return menuBar;
    }

    private JMenu getFileMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");

        saveMenuItem.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        Task3.this,
                        "Данные сохранены."));

        exitMenuItem.addActionListener(e -> System.exit(0));

        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        return fileMenu;
    }

    private JMenu getEditMenu() {
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");

        copyMenuItem.addActionListener(e -> textArea.copy());
        cutMenuItem.addActionListener(e -> textArea.cut());
        pasteMenuItem.addActionListener(e -> textArea.paste());

        editMenu.add(copyMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.addSeparator();
        editMenu.add(pasteMenuItem);
        return editMenu;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task3::new);
    }
}
