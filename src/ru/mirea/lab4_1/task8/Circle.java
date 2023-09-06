package ru.mirea.lab4_1.task8;

public class Circle extends Shape{
    protected double radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
