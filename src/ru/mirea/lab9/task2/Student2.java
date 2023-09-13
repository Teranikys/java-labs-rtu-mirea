package ru.mirea.lab9.task2;

import ru.mirea.lab9.task1.Student;

public class Student2 extends Student {
    private SortingStudentsByGPA sortingByGPA = new SortingStudentsByGPA();
    public Student2(int id, int gpa) {
        super(id, gpa);
    }

    public SortingStudentsByGPA getSortingByGPA() {
        return sortingByGPA;
    }

    public void setSortingByGPA(SortingStudentsByGPA sortingByGPA) {
        this.sortingByGPA = sortingByGPA;
    }
}
