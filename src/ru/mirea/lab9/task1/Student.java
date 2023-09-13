package ru.mirea.lab9.task1;

public class Student implements Comparable<Student>{
    private int id;
    private int gpa;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public Student(int id, int gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getId(), this.getId());
    }

}
