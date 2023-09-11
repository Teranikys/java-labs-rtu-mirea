package ru.mirea.lab7.task3;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int speedx;
    private int speedy;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int speedx, int speedy) {
        this.x = x;
        this.y = y;
        this.speedx = speedx;
        this.speedy = speedy;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", speedx=" + speedx +
                ", speedy=" + speedy +
                '}';
    }

    @Override
    public void moveUp() {
        this.y += speedy;
    }

    @Override
    public void moveDown() {
        this.y -= speedy;
    }

    @Override
    public void moveLeft() {
        this.x -= speedx;
    }

    @Override
    public void moveRight() {
        this.x += speedx;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedx() {
        return speedx;
    }

    public void setSpeedx(int speedx) {
        this.speedx = speedx;
    }

    public int getSpeedy() {
        return speedy;
    }

    public void setSpeedy(int speedy) {
        this.speedy = speedy;
    }
}
