package ru.mirea.lab8;

import java.util.Scanner;

public class Task11 {
    static Scanner sc = new Scanner(System.in);
    public static int rec() {
        String str = sc.next();
        if (str.equals("00")) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                cnt++;
            }
        }
        return rec() + cnt;
    }
    public static void main(String[] args) {

        System.out.println(rec());
    }
}
