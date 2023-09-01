package ru.mirea.lab1;

public class Task5 {
    public static int factorial(int n) {
        int last1 = 1;
        int last2 = 1;
        int ans = 1;
        for (int i = 3; i <= n; i++) {
            ans = last1 + last2;
            last2 = last1;
            last1 = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(factorial(i + 1));
        }
    }
}
