package ru.mirea.lab10.task1;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private String surname;
    private String specialisation;
    private int course;
    private int group;
    private int gpa;

    public Student(String name,
                   String surname,
                   String specialisation,
                   int course, int group,
                   int gpa) {
        this.name = name;
        this.surname = surname;
        this.specialisation = specialisation;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getGpa(), o1.getGpa());
    }
}
