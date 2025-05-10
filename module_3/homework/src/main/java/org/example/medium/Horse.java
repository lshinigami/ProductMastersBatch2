package org.example.medium;

public class Horse extends Animal {
    public Horse(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Игого!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(name + " eats " + food.getFoodType());
        }
        else {
            System.out.println(name + " cannot eat " + food.getFoodType());
        }
    }
}
