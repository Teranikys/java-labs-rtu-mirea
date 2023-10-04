package ru.mirea.lab21.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Integer[] nums = {5, 1, 4, 10, 9};
        Array<Integer> a = new Array<>(new ArrayList<>(List.of(nums)));

        System.out.println(a.get(4));
        a.print5first();
    }
}
