package ru.mirea.lab3.Formatting.task3;

import java.util.Formatter;

public class Report {
    public static String  generateReport(Employee[] employees) {
        Formatter fmt = new Formatter();
        for (Employee employee : employees) {
            fmt.format("Name: %s \t\t\t Salary: %.2f\n", employee.getFullname(), employee.getSalary());
        }
        return "Report\n" + fmt.out();
    }
}
