package ru.mirea.lab9.task2;

public class Task2 {
    private static int separation(Student[] a, int l, int r) {
        Student separator = a[r];
        int i = l - 1;

        Student temp;
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
    public static void quickSort(Student[] a, int l, int r) {
        if (l < r) {
            int separator = separation(a, l, r);

            quickSort(a, l, separator - 1);
            quickSort(a, separator + 1, r);
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(1, 5);
        students[1] = new Student(2, 4);
        students[2] = new Student(3, 3);
        students[3] = new Student(4, 4);
        students[4] = new Student(5, 3);
        students[5] = new Student(6, 3);

        quickSort(students, 0, students.length - 1);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
