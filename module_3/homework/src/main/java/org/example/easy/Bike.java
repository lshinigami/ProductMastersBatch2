package org.example.easy;

public class Bike extends Vehicle {
    protected Bike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Wooooooom");
    }
}
