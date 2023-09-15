package ru.mirea.lab11.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Chebakov";
        Calendar calendar = new GregorianCalendar(2023, Calendar.SEPTEMBER, 8, 15, 50);
        Date date = new Date();
        System.out.println(developer);
        System.out.println(calendar.getTime());
        System.out.println(date);
    }
}
