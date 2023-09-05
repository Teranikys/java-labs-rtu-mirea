package ru.mirea.lab3.MathRandom.task3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = random.nextInt(10, 100);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean flag = false;
        for (int i = 1; i < 4; i++) {
            if (a[i - 1] >= a[i]) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("The array is ascending");
        } else {
            System.out.println("The array is not ascending");
        }
    }
}
