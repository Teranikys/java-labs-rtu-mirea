package ru.mirea.lab9.task1;

import java.io.UncheckedIOException;

public class Task1 {

    public static void insertionSort(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            int aux = i;
            for (int j = i - 1; j >= 0; j--) {
                if (students[aux].compareTo(students[j]) > 0) {
                    Student temp = students[aux];
                    students[aux--] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(6, 5);
        students[1] = new Student(4, 4);
        students[2] = new Student(5, 3);
        students[3] = new Student(2, 4);
        students[4] = new Student(3, 3);
        students[5] = new Student(1, 3);

        insertionSort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
