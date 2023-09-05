package ru.mirea.lab3.Wrappers.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        Double num1 = Double.valueOf(sc.nextDouble());
        Double num2 = Double.valueOf(sc.nextDouble());
        System.out.println(num1);
        System.out.println(num2);
        //2
        double a = Double.parseDouble(sc.next());
        System.out.println(a);
        //3
        Double val = 3.14;
        int valInt = Integer.parseInt(String.valueOf(val));
        double valDouble = val;
        float valFloat = Float.parseFloat(String.valueOf(val));
        byte valByte = Byte.parseByte(String.valueOf(val));
        long valLong = Long.parseLong(String.valueOf(val));
        short valShort = Short.parseShort(String.valueOf(val));
        //4
        System.out.println(val);
        //5
        String d = Double.toString(3.14);

    }
}
