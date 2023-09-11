package ru.mirea.lab7.task4;

public class MathFunc implements MathCalculable{
    @Override
    public long pow(long number, long exp) {
        long res = number;
        for (int i = 0; i < exp - 1; i++) {
            res *= number;
        }
        return res;
    }

    @Override
    public double abs(double real, double img) {
        return Math.sqrt(real * real + img * img);
    }
}
