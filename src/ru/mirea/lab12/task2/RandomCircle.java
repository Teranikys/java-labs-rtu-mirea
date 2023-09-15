package ru.mirea.lab12.task2;

import ru.mirea.lab4_1.task8.Circle;
import ru.mirea.lab5.task2.Point;
import ru.mirea.lab5.task2.Randomable;

import java.awt.*;
import java.util.Random;

public class RandomCircle extends Circle implements Randomable {
    private ru.mirea.lab5.task2.Point point;
    @Override
    public void generateRandomly() {
        Random rand = new Random();
        this.color = new Color(rand.nextInt(0, 255), rand.nextInt(0, 255), rand.nextInt(0, 255));
        this.radius = rand.nextInt(0, 250);
        this.point = new ru.mirea.lab5.task2.Point();
        this.point.generateRandomly();
    }

    public ru.mirea.lab5.task2.Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
