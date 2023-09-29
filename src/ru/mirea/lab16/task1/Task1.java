package ru.mirea.lab16.task1;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    private final int secretNumber;
    private final JTextField guessField;

    public Task1() {
        setTitle("Угадай число");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        secretNumber = (int) (Math.random() * 21);
        System.out.println(secretNumber);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Угадай число от 0 до 20:");
        panel.add(label, BorderLayout.NORTH);

        guessField = new JTextField(10);
        panel.add(guessField, BorderLayout.CENTER);

        JButton guessButton = new JButton("Проверить");
        panel.add(guessButton, BorderLayout.SOUTH);

        guessButton.addActionListener(e -> checkGuess());

        add(panel);

        setVisible(true);
    }

    private void checkGuess() {
        try {
            int userGuess = Integer.parseInt(guessField.getText());

            if (userGuess == secretNumber) {
                JOptionPane.showMessageDialog(this, "Поздравляем! Вы угадали число " + secretNumber + ".", "Победа", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                String message;

                if (userGuess < secretNumber) {
                    message = "Загаданное число больше. Попробуйте еще раз.";
                } else {
                    message = "Загаданное число меньше. Попробуйте еще раз.";
                }

                JOptionPane.showMessageDialog(this, message, "Игра окончена", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Неверный ввод. Попробуйте еще раз.", "Игра окончена", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task1::new);
    }
}
