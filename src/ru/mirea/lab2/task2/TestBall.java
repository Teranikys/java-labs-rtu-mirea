package ru.mirea.lab2.task2;

public class TestBall {
    public static void main(String[] args) {
        //test empty Constructor
        Ball ball = new Ball();
        //test toString
        System.out.println(ball);
        //test Constructor
        Ball ball1 = new Ball(1.0, 2.0);
        System.out.println(ball1);
        //test setX & getX
        ball.setX(2.0);
        System.out.println(ball.getX());
        //test setY & getY
        ball.setY(3.0);
        System.out.println(ball.getY());
        //test setXY
        ball.setXY(10.0, 20.0);
        System.out.println(ball);
        //test move
        ball.move(50.0, 40.0);
        System.out.println(ball);
    }
}
