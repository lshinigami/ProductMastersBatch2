package org.example.week_3.easy;

public class Bike extends Vehicle {
    protected Bike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Wooooooom");
    }
}
