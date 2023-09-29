package ru.mirea.lab14.task3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(sc.nextLine());
        in.findAll(Pattern.compile("\\d+\\.\\d\\d (USD|RUB|EU)"))
                .map(MatchResult::group)
                .forEach(System.out::println);
    }
}

// Example 1
/*Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU. a) пример правильных выражений: 25.98 USD.  b) пример неправильных выражений: 44 ERR, 0.004 EU. */
//Example 2
/*25.98 USD, 44 ERR, 0.004 EU, 1000.05 RUB*/
