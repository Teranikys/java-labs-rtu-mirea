package ru.mirea.lab4_1.task8;

import java.awt.*;

public class Circle extends Shape{
    protected int radius;

    public Circle() {
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Color color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
