package ru.mirea.lab2.task4;

public class Computer {
    private int id;
    private String model;

    public Computer(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
