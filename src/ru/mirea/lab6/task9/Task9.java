package ru.mirea.lab6.task9;

import ru.mirea.lab6.task6.Printable;
import ru.mirea.lab6.task7.Book;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printable[] books = new Book[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Book book = new Book(name);
            books[i] = book;
        }
        for (Printable book: books) {
            book.print();
        }
    }
}
