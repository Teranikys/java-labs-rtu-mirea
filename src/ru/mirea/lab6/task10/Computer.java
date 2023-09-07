package ru.mirea.lab6.task10;

public class Computer {
    private Company company;
    private final int id;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company=" + company +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                '}';
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getId() {
        return id;
    }

    public Computer(Company company, int id, int size, String resolution, int cores) {
        this.company = company;
        this.id = id;
        this.memory = new Memory(size);
        this.monitor = new Monitor(resolution);
        this.processor = new Processor(cores);
    }
}
