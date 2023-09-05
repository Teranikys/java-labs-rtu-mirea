package ru.mirea.lab3.MathRandom.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] a = new double[random.nextInt(10)];

        for (int i = 0; i < a.length; i++){
            a[i] = Math.round(Math.random() * 1000);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
