package ru.mirea.lab20.task4;

public class Task4 {
    public static void main(String[] args) {
        Integer[] nums = {5, 1, 4, 10, 9};
        MinMax<Integer> minMax = new MinMax<>(nums);

        System.out.println(minMax.Max());
        System.out.println(minMax.Min());
    }
}
