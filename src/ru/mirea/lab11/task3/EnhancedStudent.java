package ru.mirea.lab11.task3;

import ru.mirea.lab10.task1.Student;

import java.util.Calendar;

public class EnhancedStudent extends Student {
    private Calendar dob;

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public EnhancedStudent(String name, String surname, String specialisation, int course, int group, int gpa, Calendar dob) {
        super(name, surname, specialisation, course, group, gpa);
        this.dob = dob;
    }

    public EnhancedStudent(String name, String surname, String specialisation, int course, int group, int gpa) {
        super(name, surname, specialisation, course, group, gpa);
    }

    public String toString(Level level) {
        switch (level) {
            case SHORT -> {
                return "EnhancedStudent{" +
                        super.toString() +
                        ", " + "dob=" + dob.get(Calendar.YEAR) +
                        "} ";
            }
            case MEDIUM -> {
                return "EnhancedStudent{" +
                        super.toString() +
                        ", " + "dob=" + dob.get(Calendar.YEAR) +
                        ", " + dob.get(Calendar.MONTH) +
                        "} ";
            }
            case COMPLETE -> {
                return "EnhancedStudent{" +
                        super.toString() +
                        ", " + "dob=" + dob.get(Calendar.YEAR) +
                        ", " + dob.get(Calendar.MONTH) +
                        ", " + dob.get(Calendar.DAY_OF_MONTH) +
                        "} ";
            }
        }
        return "EnhancedStudent{" +
                super.toString() +
                ", " + "dob=" + dob.get(Calendar.YEAR) +
                ", " + dob.get(Calendar.MONTH) +
                ", " + dob.get(Calendar.DAY_OF_MONTH) +
                "} ";
    }

}
