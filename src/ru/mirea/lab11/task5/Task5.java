package ru.mirea.lab11.task5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task5 {

    public static void main(String[] args) {
        Date date = new Date();

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            a.add(i);
        }
        a.remove(5);
        a.remove(6);
        a.indexOf(2);
        a.indexOf(8);

        Date date1 = new Date();
        System.out.println(date1.getTime() - date.getTime());
        date = new Date();
        LinkedList<Integer> b = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            b.add(i);
        }
        b.remove(5);
        b.remove(6);
        b.indexOf(2);
        b.indexOf(8);

        date1 = new Date();
        System.out.println(date1.getTime() - date.getTime());
    }
}
