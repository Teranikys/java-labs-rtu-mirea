package ru.mirea.lab1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        int average = sum / N;

        System.out.println(sum + " " + average);
    }
}
