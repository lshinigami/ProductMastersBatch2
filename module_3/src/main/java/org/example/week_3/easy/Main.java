package org.example.week_3.easy;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal horse = new Horse();
        cat.makeSound();
        cat.walk();
        dog.makeSound();
        dog.walk();
        cow.makeSound();
        cow.walk();
        horse.makeSound();
        horse.walk();
        System.out.println();

        Vehicle car = new Car("Rolls Royce", 2025);
        Vehicle bike = new Bike("Yamaha", 2020);


        car.start();
        bike.start();
    }
}