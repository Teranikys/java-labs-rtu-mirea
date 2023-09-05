package ru.mirea.lab3.MathRandom.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = -1;
        while (n <= 0) {
            n = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n);
        }
        System.out.println(Arrays.toString(a));
        int length = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                length++;
            }
        }
        int[] b = new int[length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[j++] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
