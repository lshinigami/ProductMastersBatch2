package org.example.easy;

public abstract class Animal {
    protected String name;
    protected abstract void makeSound();
    protected void walk() {
        System.out.println("Walking");
    }
}
