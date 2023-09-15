package ru.mirea.lab11.task2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        System.out.println("Enter year, month, day, hour and minutes to compare: ");
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, sc.nextInt());
        calendar1.set(Calendar.MONTH, sc.nextInt() - 1);
        calendar1.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        calendar1.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        calendar1.set(Calendar.MINUTE, sc.nextInt());

        switch (calendar.compareTo(calendar1)) {
            case 1 -> System.out.println("Введённая дата уже прошла");
            case 0 -> System.out.println("Даты равны");
            case -1 -> System.out.println("Введённая дата ещё наступит");
        }
    }
}
