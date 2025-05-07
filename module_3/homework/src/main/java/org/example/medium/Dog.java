package org.example.medium;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    public void eat(Food food) {
        if (food.getFoodType().equalsIgnoreCase("meat")) {
            System.out.println(name + " eats " + food.getFoodType());
        }
        else {
            System.out.println(name + " cannot eat " + food.getFoodType());
        }
    }
}
