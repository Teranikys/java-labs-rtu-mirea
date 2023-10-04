package ru.mirea.lab20.task4;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T Min() {
        T minim = array[0];
        for (T elem : array) {
            if (elem.compareTo(minim) < 0) {
                minim = elem;
            }
        }
        return minim;
    }

    public T Max() {
        T maxim = array[0];
        for (T elem : array) {
            if (elem.compareTo(maxim) > 0) {
                maxim = elem;
            }
        }
        return maxim;
    }
}
