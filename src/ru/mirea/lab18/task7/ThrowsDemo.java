package ru.mirea.lab18.task7;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        while (true) {
            try {
                printDetails(key);
                break;
            } catch (Exception ignored) {
            }
        }
    }

    private void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
