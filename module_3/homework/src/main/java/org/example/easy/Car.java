package org.example.easy;

public class Car extends Vehicle {
    protected Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Trrrrrrr");
    }
}
