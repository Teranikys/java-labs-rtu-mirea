package ru.mirea.lab3.Formatting.task2;

import ru.mirea.lab3.Formatting.task1.Converter;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of your purchase: ");
        double price = sc.nextDouble();
        System.out.println("Choose the currency");
        System.out.println("1. Dollars");
        System.out.println("2. Euro");
        System.out.println("3. Yuan");
        System.out.println("4. Pound");
        System.out.print("Enter the number: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println(Converter.toDollar(price));
            case 2 -> System.out.println(Converter.toEuro(price));
            case 3 -> System.out.println(Converter.toYuan(price));
            case 4 -> System.out.println(Converter.toPound(price));
        }
    }
}
