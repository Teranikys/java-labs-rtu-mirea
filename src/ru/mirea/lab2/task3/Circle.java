package ru.mirea.lab2.task3;

public class Circle {
    private Point center = new Point();
    private double r = 1.0;

    public Circle() {
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", r=" + r +
                '}';
    }
}
