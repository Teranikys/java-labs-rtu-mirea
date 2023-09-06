package ru.mirea.lab4_1.task2;

public class Task2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(95267, "Iphone", 500.);
        Phone phone2 = new Phone(95168, "Samsung", 600.);
        Phone phone3 = new Phone(40495, "Huawei", 700.);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone1.receiveCall("Vova"));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.receiveCall("Artyom"));
        System.out.println(phone2.getNumber());
        System.out.println(phone3.receiveCall("Pasha"));
        System.out.println(phone3.getNumber());
        System.out.println(phone1.receiveCall("Kyril", 40495));
        System.out.println(phone1.sendMessage(12345, 43213, 32123));
    }
}
