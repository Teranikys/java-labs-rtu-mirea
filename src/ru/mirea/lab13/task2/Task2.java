package ru.mirea.lab13.task2;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("Vlad", "Chebakov", "Olegovich");
        System.out.println(person);
        Person person1 = new Person("Chebakov");
        System.out.println(person1);
        Person person2 = new Person("Vlad", "Chebakov");
        System.out.println(person2);
    }
}
