package ru.mirea.lab4_1.task8;

import java.awt.*;

public class Square extends Rectangle{
    public Square(Color color, boolean filled, int side) {
        super(color, filled, side, side);
    }

    public Square() {
    }

    public Square(int side) {
        super(side, side);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(int side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(int length) {
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
