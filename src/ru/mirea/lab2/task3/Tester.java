package ru.mirea.lab2.task3;

public class Tester {
    public static void main(String[] args) {
        final int N = 10;
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            Point point = new Point(i, i + 1.0);
            circles[i] = new Circle(point, i);
        }
        for (Circle elem : circles) {
            System.out.println(elem);
        }
    }
}
