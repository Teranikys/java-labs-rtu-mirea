package ru.mirea.lab4_1.task4;

public class Task4 {
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[2][2];
        Matrix am = new Matrix(3, a);
        Matrix bm = new Matrix(2, b);
        try {
            am.add(bm);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
