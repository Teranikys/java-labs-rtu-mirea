package ru.mirea.lab2.task5;

import java.util.Scanner;

public class DogKennel {

    private static final int capacity = 100;
    private static int length = 0;
    private static Dog[] dogs = new Dog[capacity];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            Dog dog = new Dog(name, age);
            dogs[length++] = dog;
        }

        System.out.println(dogs[1].getHumanAge());
        System.out.println(dogs[2].getHumanAge());
    }
}
