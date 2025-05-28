package org.example.week_3.easy;

public abstract class Animal {
    protected String name;
    protected abstract void makeSound();
    protected void walk() {
        System.out.println("Walking");
    }
}
