package ru.mirea.lab18.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Wrong integer number format");
        } catch (ArithmeticException e) {
            System.out.println("Attempted to divide by zero");
        } catch (Exception e) {
            System.out.println("Some Error occurred");
        } finally {
            System.out.println("Finally");
        }
    }
}
