package ru.mirea.lab9.task2;

import ru.mirea.lab9.task1.Student;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Task2 {
    private static int separation(Student2[] a, int l, int r) {
        Student2 separator = a[r];
        int i = l - 1;

        Student2 temp;
        for (int j = l; j < r; j++) {
            if (a[j].getSortingByGPA().compare(a[j], separator) < 1) {
                temp = a[++i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[++i];
        a[i] = a[r];
        a[r] = temp;
        return i;
    }
    public static void quickSort(Student2[] a, int l, int r) {
        if (l < r) {
            int separator = separation(a, l, r);

            quickSort(a, l, separator - 1);
            quickSort(a, separator + 1, r);
        }
    }
    public static void main(String[] args) {
        Student2[] students = new Student2[6];
        students[0] = new Student2(1, 5);
        students[1] = new Student2(2, 4);
        students[2] = new Student2(3, 3);
        students[3] = new Student2(4, 4);
        students[4] = new Student2(5, 3);
        students[5] = new Student2(6, 3);

        quickSort(students, 0, students.length - 1);

        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}
