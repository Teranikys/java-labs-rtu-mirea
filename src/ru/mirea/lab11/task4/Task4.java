package ru.mirea.lab11.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        System.out.println("Введите Год, месяц, число");
        System.out.println("часы и минуты");
        calendar.set(Calendar.YEAR, sc.nextInt());
        calendar.set(Calendar.MONTH, sc.nextInt());
        calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt() - 1);
        calendar.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        calendar.set(Calendar.MINUTE, sc.nextInt());
        Date date = new Date(calendar.getTimeInMillis());
    }
}
