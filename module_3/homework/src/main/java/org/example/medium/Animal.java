package org.example.medium;

public abstract class Animal {
    protected String name;
    protected abstract void makeSound();
    protected void walk() {
        System.out.println(name + " Walking");
    }

    protected void eat(Food food) {
        System.out.println(name + " eats " + food);
    }
}
