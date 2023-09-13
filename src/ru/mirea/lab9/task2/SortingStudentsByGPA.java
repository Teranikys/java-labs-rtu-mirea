package ru.mirea.lab9.task2;

import ru.mirea.lab9.task1.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getGpa(), o1.getGpa());
    }
}
