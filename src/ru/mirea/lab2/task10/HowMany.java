package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String input = "";
        while (!input.equals("end")) {
            input = sc.next();
            n++;
        }
        System.out.println(n);
    }
}
