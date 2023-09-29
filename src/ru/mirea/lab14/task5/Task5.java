package ru.mirea.lab14.task5;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(0?[1-9]|[12]\\d|3[01])/(0?[1-9]|1[0-2])/(19\\d\\d|[2-9]\\d\\d\\d)");
        out.println("How many dates would you like to enter: ");
        out.flush();
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String input = in.next();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                out.println(input);
            }
        }
        out.flush();
    }
}
