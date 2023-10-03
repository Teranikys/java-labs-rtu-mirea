package ru.mirea.lab17.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public int getSalary() {
        return model.getSalary();
    }

    public void setSalary(int salary) {
        model.setSalary(salary);
    }

    public String getEmployeeName() {
        return model.getEmployeeName();
    }

    public void setEmployeeName(String employeeName) {
        model.setEmployeeName(employeeName);
    }

    public void updateView() {
        view.printEmployeeSalary(model.getSalary(), model.getEmployeeName());
    }
}
