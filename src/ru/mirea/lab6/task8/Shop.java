package ru.mirea.lab6.task8;

import ru.mirea.lab6.task6.Printable;
import ru.mirea.lab6.task7.Book;

public class Shop implements Printable {
    private Book[] books;

    public Shop(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public void print() {
        for (Book book : books) {
            book.print();
        }
    }
}
