package ru.mirea.lab14.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(in.next());
        if (matcher.matches()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
