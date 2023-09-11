package ru.mirea.lab7.task3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle() {
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() throws InvalidSpeedException {
        if (speedTest()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            throw new InvalidSpeedException("Points have different speeds.");
        }
    }

    @Override
    public void moveDown() throws InvalidSpeedException {
        if (speedTest()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        } else {
            throw new InvalidSpeedException("Points have different speeds.");
        }
    }

    @Override
    public void moveLeft() throws InvalidSpeedException {
        if (speedTest()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else {
            throw new InvalidSpeedException("Points have different speeds.");
        }
    }

    @Override
    public void moveRight() throws InvalidSpeedException {
        if (speedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        } else {
            throw new InvalidSpeedException("Points have different speeds.");
        }
    }


    public boolean speedTest() {
        return (topLeft.getSpeedx() == bottomRight.getSpeedx()) &&
                (topLeft.getSpeedy() == bottomRight.getSpeedy());
    }

}
