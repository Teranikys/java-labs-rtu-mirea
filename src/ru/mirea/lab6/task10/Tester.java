package ru.mirea.lab6.task10;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop(sc.nextInt());
        for (int i = 0; i < shop.getCapacity(); i++) {
            System.out.println("Enter: Company, " +
                    "Memory size, Monitor resolution and Processor cores: ");
            Company company = Company.valueOf(sc.next());
            int memory = sc.nextInt();
            String monitor = sc.next();
            int processor = sc.nextInt();
            Computer computer = new Computer(company, i, memory, monitor, processor);
            shop.addComputer(computer);
        }
        shop.removeComputer(2);
        shop.removeComputer(2);
    }
}


/*
3
HP 256 1920x1080 4
Lenovo 1024 920x640 2
Apple 512 4096x2048 16
*/