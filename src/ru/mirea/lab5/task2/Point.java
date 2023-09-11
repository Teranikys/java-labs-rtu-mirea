package ru.mirea.lab5.task2;

import java.awt.*;
import java.util.Random;

public class Point implements Randomable{
    int x, y;

    @Override
    public void generateRandomly() {
        Random rand = new Random();
        x = rand.nextInt(0, 920 - 200);
        y = rand.nextInt(0, 640 - 200);
    }
}
