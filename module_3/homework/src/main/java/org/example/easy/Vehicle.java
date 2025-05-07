package org.example.easy;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void start();
}
