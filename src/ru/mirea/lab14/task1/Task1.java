package ru.mirea.lab14.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d+\\s?");
        System.out.println("Enter a string to split with numbers as splitters: ");
        String input = sc.nextLine();
        String[] words = pattern.split(input);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
