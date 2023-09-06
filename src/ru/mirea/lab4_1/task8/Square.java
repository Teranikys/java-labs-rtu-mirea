package ru.mirea.lab4_1.task8;

public class Square extends Rectangle{
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
