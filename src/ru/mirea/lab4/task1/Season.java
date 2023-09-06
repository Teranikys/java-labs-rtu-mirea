package ru.mirea.lab4.task1;

public enum Season {
    WINTER(-15),
    SPRING(15),
    SUMMER(25),
    AUTUMN(10);
    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

}
