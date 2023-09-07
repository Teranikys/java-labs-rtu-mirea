package ru.mirea.lab6.task11;

public class Fahrenheit implements Convertable{
    @Override
    public double convert(double tmp) {
        return (tmp * 9/5) + 32;
    }
}
