package ru.mirea.lab14.task4;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(sc.nextLine());
        in.findAll(Pattern.compile(".*\\d \\+.*"))
                .map(MatchResult::group)
                .forEach(System.out::println);
    }
}


// Example 1:
/*a) пример правильных выражений:(1 + 8) – 9 / 4 */
// Example 2:
/*b) пример неправильных выражений: 6 / 5 – 2 * 9 */
