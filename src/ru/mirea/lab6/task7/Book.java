package ru.mirea.lab6.task7;

import ru.mirea.lab6.task6.Printable;

public class Book implements Printable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
