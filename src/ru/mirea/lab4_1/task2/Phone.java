package ru.mirea.lab4_1.task2;

public class Phone {
    private int number;
    private String model;

    public Phone() {
    }

    private double weight = 100.;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, int number) {
        return "Звонит " + name + " по телефону " + number;
    }

    public String sendMessage(int... number) {
        StringBuilder result = new StringBuilder("Отправить сообщения на номера:");
        for (int s : number) {
            result.append(" ").append(s).append(" ");
        }
        return result.toString();
    }

}
