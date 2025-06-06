package org.example.week_3.medium;

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
        if (food instanceof Grass) {
            System.out.println(name + " eats " + food.getFoodType());
        }
        else {
            System.out.println(name + " cannot eat " + food.getFoodType());
        }
    }
}
