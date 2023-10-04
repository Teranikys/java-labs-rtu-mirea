package ru.mirea.lab22.task1;

import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) throws EmptyStackException{
        this.result = result;
        this.calculate();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        return (op1 != '*' && op1 != '/') ||
                (op2 != '+' && op2 != '-');
    }

    private static long applyOp(char op, long b, long a) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }

    private void calculate() throws EmptyStackException{
        boolean flag = false;
        char[] tokens = result.toCharArray();
        Stack<Long> values = new
                Stack<>();
        Stack<Character> ops = new
                Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    StringBuilder sbuf = new
                            StringBuilder();
                    while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                        sbuf.append(tokens[i++]);
                    }
                    values.push(Long.parseLong(sbuf.toString()));
                    i--;
                }
                case '(' -> ops.push(tokens[i]);
                case ')' -> {
                    while (ops.peek() != '(') {
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    }
                    ops.pop();
                }
                case '+', '-', '*', '/' -> {
                    while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    }
                    ops.push(tokens[i]);
                }
            }
        }
        while (!ops.empty() && !flag)
            values.push(applyOp(ops.pop(),
                    values.pop(),
                    values.pop()));

        this.result = values.pop().toString();
    }
}
