package ru.mirea.lab8;

import java.util.Scanner;

public class Task10 {
    public static int reverse(int n, int revnum) {
        if (n == 0) {
            return revnum;
        }
        return reverse(n / 10, revnum * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n, 0));
    }
}
