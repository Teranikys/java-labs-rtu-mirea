package ru.mirea.lab6.task10;

import java.util.Arrays;

public class Shop {
    private final int capacity;
    private int length = 0;
    private final Computer[] computers;

    public Shop(int capacity) {
        this.capacity = capacity;
        computers = new Computer[this.capacity];
    }

    @Override
    public String toString() {
        return "Shop{" +
                "capacity=" + capacity +
                ", length=" + length +
                ", computers=" + Arrays.toString(computers) +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void addComputer(Computer computer) {
        if (length < capacity) {
            this.computers[length++] = computer;
            System.out.println("Computer successfully added");
        } else {
            System.out.println("Error: max amount of computers has been reached");
        }
    }

    public void removeComputer(int id) {
        int ind = findById(id);
        if (ind != -1){
                computers[ind] = computers[--length];
                System.out.println("Computer successfully removed");
        } else {
            System.out.println("Computer is not found");
        }
    }

    public int findById(int id) {
        for (int i = 0; i < length; i++) {
            if (computers[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
