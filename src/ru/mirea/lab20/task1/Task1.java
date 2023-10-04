package ru.mirea.lab20.task1;

public class Task1 {
    public static void main(String[] args) {
        GenericClass<String, Animal, Double> a = new GenericClass<>("Hello", new Animal(), 3.14);
        a.printClasses();
    }
}
