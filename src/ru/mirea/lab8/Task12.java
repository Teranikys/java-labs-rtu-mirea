package ru.mirea.lab8;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task12 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void rec() {
        int input = sc.nextInt();
        if (input == 0) {
            return;
        }
        if (input % 2 != 0) {
            out.println(input);
        }
        rec();
    }
    public static void main(String[] args) {
        rec();
        out.flush();
    }
}
