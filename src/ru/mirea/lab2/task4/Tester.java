package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a computer name: ");
            String input = sc.nextLine();
            Computer computer = new Computer(i, input);
            shop.addComputer(computer);
        }

        System.out.println(shop.findByID(3));
        System.out.println(shop.findByID(5));

        System.out.println(shop.deleteByID(2));
        System.out.println(shop.deleteByID(6));
        System.out.println(shop.deleteByID(6));

    }
}

/*
Spectrum
Atari
Playstation
IBM
Эльбрус
Macintosh
HP Victus
Lenovo Legion
Honor MateBook
BestComputerEver
*/
