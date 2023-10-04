package ru.mirea.lab22.task1;

import ru.mirea.lab17.example.Course;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Scanner;

public class CalculatorController extends JFrame {
    private Calculator model;
    private View view;

    public CalculatorController(Calculator model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printResult(model.getResult());
    }

    public String getResult() {
        return model.getResult();
    }

    public void setResult(String result) {
        try {
            model.setResult(result);
        } catch (EmptyStackException e) {
            view.printException(e);
        }
    }

    private JTextField display;
    private String currentValue;
    private String returnValue = "";
    private boolean newInput;

    public CalculatorController(Calculator model) {
        this.model = model;
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
            button.addActionListener(e -> returnValue = onButtonClick(label));
            buttonPanel.add(button);

        }
        return buttonPanel;
    }

    public String onButtonClick(String label) {
        if (label.equals("=")) {
            newInput = true;
            setResult(display.getText());
            display.setText(model.getResult());
        } else {
            display.setText(display.getText() + label);
        }
        return "";
    }

    public JTextField getDisplay() {
        return display;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public boolean isNewInput() {
        return newInput;
    }

    public void setNewInput(boolean newInput) {
        this.newInput = newInput;
    }

    public static void main(String[] args) {
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(model);

    }
}
