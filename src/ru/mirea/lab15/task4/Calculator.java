package ru.mirea.lab15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Calculator extends JFrame {
    private JTextField display;
    private double currentValue;
    private String currentOperator;
    private boolean newInput;

    public Calculator() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = getButtonPanel();

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private JPanel getButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 20, 20));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(e -> onButtonClick(label));
            buttonPanel.add(button);

        }
        return buttonPanel;
    }

    private void onButtonClick(String label) {
        if (label.matches("\\d+") || label.equals(".")) {
            if (newInput) {
                display.setText("");
                newInput = false;
            }
            display.setText(display.getText() + label);
        } else if (label.equals("=")) {
            calculate();
            newInput = true;
        } else {
            if (!newInput) {
                calculate();
            }
            currentOperator = label;
            currentValue = Double.parseDouble(display.getText());
            newInput = true;
        }
    }

    private void calculate() {
        if (currentOperator != null) {
            double secondValue = Double.parseDouble(display.getText());
            switch (currentOperator) {
                case "+" -> currentValue += secondValue;
                case "-" -> currentValue -= secondValue;
                case "*" -> currentValue *= secondValue;
                case "/" -> {
                    if (secondValue != 0) {
                        currentValue /= secondValue;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ошибка деления на ноль", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            display.setText(String.valueOf(currentValue));
            currentOperator = null;
        }
    }
}
