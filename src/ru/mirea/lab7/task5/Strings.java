package ru.mirea.lab7.task5;

public interface Strings {
    static int length(String string){
        return string.length();
    }
    static String oddPrint(String string){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                result.append(string.charAt(i));
            }
        }
        return result.toString();
    }
    static String invert(String string){
        StringBuilder result = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}
