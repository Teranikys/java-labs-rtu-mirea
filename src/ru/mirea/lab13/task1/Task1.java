package ru.mirea.lab13.task1;

import java.util.Locale;

public class Task1 {
    private static void method(String s) {
        System.out.println(s.charAt(s.length() - 1));
        boolean endsWith = s.endsWith("!!!");
        boolean startsWith = s.startsWith("I like");
        boolean contains = s.contains("Java");
        int find = s.indexOf("Java");
        s = s.replace("a", "o");
        s = s.toUpperCase();
        s = s.toLowerCase();
        System.out.println(s.substring(4, 8));
        System.out.println(s);

    }
    public static void main(String[] args) {
        method("I like Java");
    }
}
