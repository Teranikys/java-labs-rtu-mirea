package ru.mirea.lab20.task1;

import java.io.Serializable;

public class GenericClass<T extends Comparable<String>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public GenericClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getThird() {
        return third;
    }

    public void setThird(K third) {
        this.third = third;
    }

    public void printClasses() {
        System.out.println(first.getClass());
        System.out.println(second.getClass());
        System.out.println(third.getClass());
    }
}
