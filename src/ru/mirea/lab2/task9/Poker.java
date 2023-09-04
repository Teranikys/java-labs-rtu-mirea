package ru.mirea.lab2.task9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cards = new String[36];
        String[] values = new String[36 / 4];
        values[0] = "6 ";
        values[1] = "7 ";
        values[2] = "8 ";
        values[3] = "9 ";
        values[4] = "10 ";
        values[5] = "Валет ";
        values[6] = "Дама ";
        values[7] = "Король ";
        values[8] = "Туз ";
        String[] suits = new String[36 / 9];
        suits[0] = "Червы";
        suits[1] = "Трефы";
        suits[2] = "Пики";
        suits[3] = "Крестье";
        for (int i = 0; i < 36; i++){
            cards[i] = values[i % 9] + suits[i % 4];
        }
        int n = sc.nextInt();
        Random rand  = new Random();
        for (int i = 0; i < 36; i++) {
            int indexToSwap = rand.nextInt(36);
            String aux = cards[indexToSwap];
            cards[indexToSwap] = cards[i];
            cards[i] = aux;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + " игрок: ");
            for (int j = 0; j < 5; j++){
                System.out.print(cards[i * 5 + j] + ", ");
            }
            System.out.println();
        }
    }
}
