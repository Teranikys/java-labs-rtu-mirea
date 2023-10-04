package ru.mirea.lab20.task4_1;

public class Task4_1 {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;

        double sumResult = Calculator.sum(a, b); // Результат: 7.5
        double multiplyResult = Calculator.multiply(a, b); // Результат: 12.5
        double divideResult = Calculator.divide(a, b); // Результат: 2.0
        double subtractionResult = Calculator.subtraction(a, b); // Результат: 2.5
    }
}
