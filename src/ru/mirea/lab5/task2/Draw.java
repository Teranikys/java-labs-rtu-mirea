package ru.mirea.lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Draw extends JPanel {
    public void drawing() {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random rand = new Random();

        for(int i = 0; i < 20; i++) {
            int shape = rand.nextInt(0, 2);
            switch (shape) {
                case 0 -> {
                    RandomRectangle rectangle = new RandomRectangle();
                    rectangle.generateRandomly();
                    g.setColor(rectangle.getColor());
                    g.fillRect(rectangle.getPoint().x, rectangle.getPoint().y, rectangle.getWidth(), rectangle.getLength());
                }
                case 1 -> {
                    RandomCircle circle = new RandomCircle();
                    circle.generateRandomly();
                    g.setColor(circle.getColor());
                    g.fillOval(circle.getPoint().x, circle.getPoint().y, circle.getRadius(), circle.getRadius());
                }
            }
        }
    }

}