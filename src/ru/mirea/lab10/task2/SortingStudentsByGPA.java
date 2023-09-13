package ru.mirea.lab10.task2;

import ru.mirea.lab10.task1.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class SortingStudentsByGPA {
    static Scanner sc = new Scanner(System.in);

    public static void setArray(ArrayList<Student> iDNumber) {
        String name;
        String surname;
        String specialisation;
        int course;
        int group;
        int gpa;
        System.out.println("Введите количество студентов: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите Имя, Фамилию, Специальность, номер курса, номер группы и средний балл: ");
            name = sc.next();
            surname = sc.next();
            specialisation = sc.next();
            course = sc.nextInt();
            group = sc.nextInt();
            gpa = sc.nextInt();
            Student student = new Student(name, surname, specialisation, course, group, gpa);
            iDNumber.add(student);
        }
    }

    private static int separation(ArrayList<Student> a, int l, int r) {
        Student separator = a.get(r);
        int i = l - 1;

        Student temp;
        for (int j = l; j < r; j++) {
            if (a.get(j).compare(a.get(j), separator) < 1) {
                temp = a.get(++i);
                a.set(i, a.get(j));
                a.set(j, temp);
            }
        }
        temp = a.get(++i);
        a.set(i, a.get(r));
        a.set(r, temp);
        return i;
    }

    public static void quickSort(ArrayList<Student> a, int l, int r) {
        if (l < r) {
            int separator = separation(a, l, r);

            quickSort(a, l, separator - 1);
            quickSort(a, separator + 1, r);
        }
    }

    public static void outArray(ArrayList<Student> iDNumber) {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        setArray(iDNumber);
        quickSort(iDNumber, 0, iDNumber.size() - 1);
        outArray(iDNumber);
    }
}


/*
3
Vova Namestnikov Programist 2 20 5
Vlad Chebakov Knopkotykatel 2 8 4
Roma Guseinov Solntse 3 16 6
 */