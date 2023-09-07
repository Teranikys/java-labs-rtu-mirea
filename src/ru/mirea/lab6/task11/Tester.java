package ru.mirea.lab6.task11;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Fahrenheit fr = new Fahrenheit();
        Kelvin kl = new Kelvin();
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit: " + fr.convert(celsius));
        System.out.println("Kelvin: " + kl.convert(celsius));
    }
}
