package ru.mirea.lab4.task1;

public class Task1 {
    public static void main(String[] args) {
        Season favouriteSeason = Season.SPRING;
        System.out.println(favouriteSeason);
        lieblingsSeason(favouriteSeason);
        System.out.println();

        for (Season season : Season.values()) {
            System.out.println(season + " " + season.getTemperature() + "\n" + getDescription(season) + "\n");
        }
    }

    public static void lieblingsSeason(Season season) {
        switch (season){
            case AUTUMN -> System.out.println("Я люблю осень");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case WINTER -> System.out.println("Я люблю зиму");
        }
    }

    public static String getDescription(Season season) {
        if (season == Season.SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}
