package org.example.medium;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
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
