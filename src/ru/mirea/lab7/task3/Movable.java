package ru.mirea.lab7.task3;

public interface Movable {
    void moveUp() throws InvalidSpeedException;
    void moveDown() throws InvalidSpeedException;
    void moveLeft() throws InvalidSpeedException;
    void moveRight() throws InvalidSpeedException;
}
