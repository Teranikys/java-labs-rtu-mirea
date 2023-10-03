package ru.mirea.lab17.task2;

public class Tester {
    public static void main(String[] args) {
        Employee employee = getFromStorage();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateView();

        controller.setEmployeeName("Vlad");
        controller.setSalary(5000);

        controller.updateView();
    }

    private static Employee getFromStorage() {
        Employee employee = new Employee();
        employee.setEmployeeName("Vova");
        employee.setSalary(1000);
        return employee;
    }
}
