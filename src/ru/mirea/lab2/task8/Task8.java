package ru.mirea.lab2.task8;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        System.out.println(Arrays.toString(a));
        String aux;
        for (int i = 0; i < n / 2; i++){
            aux = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = aux;
        }
        System.out.println(Arrays.toString(a));
    }
}
