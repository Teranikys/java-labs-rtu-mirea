package ru.mirea.lab13.task4;

public class Shirt {
    String id;
    String color;
    String model;
    String size;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Shirt(String id,
                 String color,
                 String model,
                 String size) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Garment description: " +
                "The id is: " + id +
                "\n The color is: " + color +
                "\n The model is: " + model +
                "\n The size is: " + size;
    }
}
