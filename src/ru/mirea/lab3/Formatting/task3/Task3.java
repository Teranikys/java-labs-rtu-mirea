package ru.mirea.lab3.Formatting.task3;

public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Employee employee = new Employee("Denis", 10000.95454);
        Employee employee1 = new Employee("Artyom", 10000.6564);
        Employee employee2 = new Employee("Vlad", 314.1596);

        employees[0] = employee;
        employees[1] = employee1;
        employees[2] = employee2;

        System.out.print(Report.generateReport(employees));
    }
}
