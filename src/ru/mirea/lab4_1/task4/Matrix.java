package ru.mirea.lab4_1.task4;

import java.util.Arrays;

public class Matrix {
    private int capacity = 100;
    private double[][] a = new double[capacity][capacity];

    public Matrix(int capacity, double[][] a) {
        this.capacity = capacity;
        this.a = a;
    }

    public Matrix() {
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "capacity=" + capacity +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double[][] getA() {
        return a;
    }

    public void setA(double[][] a) {
        this.a = a;
    }

    public void add(Matrix b) {
        if (this.capacity == b.capacity) {
            for (int i = 0; i < this.capacity; i++) {
                for (int j = 0; j < this.capacity; j++) {
                    this.a[i][j] += b.a[i][j];
                }
            }
        } else {
            throw new IllegalArgumentException("Матрицы разного размера");
        }
    }

    public void mult(double a) {
        for (int i = 0; i < this.capacity; i++) {
            for (int j = 0; j < this.capacity; j++) {
                this.a[i][j] *= a;
            }
        }
    }
}
