package org.example.week_3.medium;

public abstract class Animal {
    protected String name;
    protected abstract void makeSound();

    protected void walk() {
        System.out.println(name + " Walking");
    }

    protected void eat(Food food) {
        System.out.println(name + " eats " + food.getFoodType());
    }
}
