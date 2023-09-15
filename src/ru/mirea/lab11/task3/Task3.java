package ru.mirea.lab11.task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {
        Calendar dob = new GregorianCalendar(2004, Calendar.JULY, 14);
        EnhancedStudent student = new EnhancedStudent("Vlad", "Chebakov", "Developer", 2, 8, 5, dob);
        System.out.println(student.toString(Level.SHORT));
        System.out.println(student.toString(Level.MEDIUM));
        System.out.println(student.toString(Level.COMPLETE));
    }
}
