package ru.mirea.lab1;

public class Task4 {
    public static void main(String[] args) {
        double[] a = new double[10];
        a[0] = 1;
        for (int i = 1; i < 10; i++) {
            a[i] = a[i - 1] + 1.0 / (i + 1);
        }
        for (double elem : a) {
            System.out.printf("%.3f\n", elem);
        }
    }
}
