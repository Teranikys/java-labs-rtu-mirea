package ru.mirea.lab13.task2;

public class Person {
    private String name = "";
    private String surname = "";
    private String patronim = "";

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

    public String getPatronim() {
        return patronim;
    }

    public void setPatronim(String patronim) {
        this.patronim = patronim;
    }

    public Person(String surname, String patronim) {
        this.surname = surname;
        this.patronim = patronim;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        if (name.isEmpty() && patronim.isEmpty()) {
            return "Person{" +
                    "surname='" + surname + '\'' +
                    '}';
        } else if (name.isEmpty()) {
            return "Person{" +
                    "surname='" + surname + '\'' +
                    ", patronim='" + patronim + '\'' +
                    '}';
        } else if (patronim.isEmpty()) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", patronim='" + patronim + '\'' +
                    '}';
        } else {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", patronim='" + patronim + '\'' +
                    '}';
        }
    }

    public Person(String name, String surname, String patronim) {
        this.name = name;
        this.surname = surname;
        this.patronim = patronim;
    }
}
