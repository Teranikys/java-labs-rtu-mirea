package ru.mirea.lab6.task1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
