package ru.mirea.lab6.task11;

public class Kelvin implements Convertable{
    @Override
    public double convert(double tmp) {
        return tmp + 273.15;
    }
}
