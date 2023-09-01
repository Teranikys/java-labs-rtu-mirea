package ru.mirea.lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[10];
        int i = 0;
        do {
            a[i] = sc.nextInt();
            i++;
        } while (i != N);
        int maxim = 0;
        int minim = 100000000;
        i = 0;
        while (i != N) {
            if (a[i] > maxim) {
                maxim = a[i];
            }
            if (a[i] < minim) {
                minim = a[i];
            }
            i++;
        }
        System.out.println("Max: " + maxim + '\n'
        + "Min: " + minim);
    }
}
