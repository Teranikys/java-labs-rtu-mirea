package ru.mirea.lab2.task4;


public class Shop {
    private final int capacity = 10;
    private int length = 0;
    private Computer[] computers = new Computer[capacity];

    public Shop() {
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers[length++] = computer;
    }

    public Computer findByID(int id) {
        for (Computer computer : computers) {
            if (id == computer.getId()) {
                return computer;
            }
        }
        return null;
    }

    public String deleteByID(int id) {
        for (int i = 0; i < length; i++) {
            if (id == computers[i].getId()) {
                computers[i] = computers[--length];
                return "Computer " + id + " successfully deleted";
            }
        }
        return "Computer " + id + " is not found";
    }
}
