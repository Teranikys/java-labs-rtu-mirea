package ru.mirea.lab21.task2;

import java.util.ArrayList;

public class Array<Number> {
    private final ArrayList<Number> array;

    public Array(ArrayList<Number> array) {
        this.array = array;
    }

    public Number get(int inx) {
        return array.get(inx);
    }

    public void print5first() {
        if (array.size() >= 5) {
            for (Number elem : array) {
                System.out.printf("%d ", elem);
            }
            System.out.println();
        } else {
            System.out.println("The array is too short.");
        }
    }
}
