package ru.mirea.lab10.task3;

import ru.mirea.lab10.task1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    static Scanner sc = new Scanner(System.in);

    public static Student[] setArray() {
        String name;
        String surname;
        String specialisation;
        int course;
        int group;
        int gpa;
        System.out.println("Введите количество студентов: ");
        int n = sc.nextInt();
        Student[] iDNumber = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите Имя, Фамилию, Специальность, номер курса, номер группы и средний балл: ");
            name = sc.next();
            surname = sc.next();
            specialisation = sc.next();
            course = sc.nextInt();
            group = sc.nextInt();
            gpa = sc.nextInt();
            Student student = new Student(name, surname, specialisation, course, group, gpa);
            iDNumber[i] = student;
        }
        return iDNumber;
    }

    public static void mergeSort(Student[] a, int l, int r) {
        if (r == l) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);

        int i = l;
        int j = m + 1;
        Student[] temp = new Student[a.length];
        for (int step = 0; step < r - l + 1; step++) {
            if ((j > r) || (i <= m && a[i].compare(a[i], a[j]) < 1)) {
                temp[step] = a[i++];
            } else {
                temp[step] = a[j++];
            }
        }
        System.arraycopy(temp, 0, a, l, r - l + 1);
    }
    public static void main(String[] args) {
        Student[] students = setArray();

        mergeSort(students, 0, students.length - 1);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
