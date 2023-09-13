package ru.mirea.lab9.task2;

public class Student extends ru.mirea.lab9.task1.Student {
    private SortingStudentsByGPA sortingByGPA = new SortingStudentsByGPA();
    public Student(int id, int gpa) {
        super(id, gpa);
    }

    public SortingStudentsByGPA getSortingByGPA() {
        return sortingByGPA;
    }

    public void setSortingByGPA(SortingStudentsByGPA sortingByGPA) {
        this.sortingByGPA = sortingByGPA;
    }
}
