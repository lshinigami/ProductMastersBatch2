package org.example.medium;

public class Cow extends Animal {
    public Cow(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Мууу!");
    }

    @Override
    public void eat(Food food) {
        if (food.getFoodType().equalsIgnoreCase("grass")) {
            System.out.println(name + " eats " + food.getFoodType());
        }
        else {
            System.out.println(name + " cannot eat " + food.getFoodType());
        }
    }
}
