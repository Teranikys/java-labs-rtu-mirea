package ru.mirea.lab7.task3;

public class Tester {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 0, 1, 1);
        MovablePoint point2 = new MovablePoint(5, 5, 1, 1);
        MovablePoint point3 = new MovablePoint(10, 10, -1, -1);
        MovableRectangle rectangle1 = new MovableRectangle(point1, point2);
        try {
            rectangle1.moveLeft();
            System.out.println("Rectangle 1 successfully moved");
        } catch (InvalidSpeedException e) {
            throw new RuntimeException(e);
        }
        MovableRectangle rectangle2 = new MovableRectangle(point1, point3);
        try {
            rectangle2.moveDown();
            System.out.println("Rectangle 2 successfully moved");
        } catch (InvalidSpeedException e) {
            throw new RuntimeException(e);
        }
    }
}
