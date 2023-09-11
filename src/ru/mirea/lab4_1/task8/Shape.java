package ru.mirea.lab4_1.task8;

import ru.mirea.lab6.task10.Company;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
