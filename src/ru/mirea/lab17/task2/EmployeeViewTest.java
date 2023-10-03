package ru.mirea.lab17.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmployeeViewTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testPrintEmployeeSalary() {
        EmployeeView employeeView = new EmployeeView();
        employeeView.printEmployeeSalary(5000, "John Doe");
        Assertions.assertEquals("The salary of employee John Doe is: 5000\n", outputStream.toString());
    }

    @Test
    public void testPrintEmployeeSalaryWithZeroSalary() {
        EmployeeView employeeView = new EmployeeView();
        employeeView.printEmployeeSalary(0, "Jane Smith");
        Assertions.assertEquals("The salary of employee Jane Smith is: 0\n", outputStream.toString());
    }

    // Add more test cases if needed

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}