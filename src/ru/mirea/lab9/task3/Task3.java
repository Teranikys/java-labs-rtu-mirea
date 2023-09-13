package ru.mirea.lab9.task3;

import ru.mirea.lab9.task2.Student2;

public class Task3 {
    public static void mergeSort(Student2[] a, int l, int r) {
        if (r == l) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);

        int i = l;
        int j = m + 1;
        Student2[] temp = new Student2[a.length];
        for (int step = 0; step < r - l + 1; step++) {
            if ((j > r) || (i <= m && a[i].getSortingByGPA().compare(a[i], a[j]) < 1)) {
                temp[step] = a[i++];
            } else {
                temp[step] = a[j++];
            }
        }
        System.arraycopy(temp, 0, a, l, r - l + 1);
    }
    public static void main(String[] args) {
        Student2[] students = new Student2[6];
        students[0] = new Student2(1, 5);
        students[1] = new Student2(2, 3);
        students[2] = new Student2(3, 3);
        students[3] = new Student2(4, 4);
        students[4] = new Student2(5, 3);
        students[5] = new Student2(6, 2);

        mergeSort(students, 0, students.length - 1);

        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}
