package org.example.hard;

public class Bird extends Pet {
    private int wingspan;

    public Bird(String petName, String petType, int animalAge, int wingspan) {
        super(petName, petType, animalAge);
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return super.toString() + " " + wingspan;
    }

}
