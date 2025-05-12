package org.example.week_3.hard;

public class Dog extends Pet {
    private String favoriteToy;

    public Dog(String petName, String petType, int animalAge, String favoriteToy) {
        super(petName, petType, animalAge);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString() {
        return super.toString() + " " + favoriteToy;
    }
}
