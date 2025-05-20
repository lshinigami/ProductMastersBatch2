package org.example.week_3.hard;

/*Согласно концепции AVMA,
1 год жизни собаки = 15 человеческим годам,
2 год = 9,
а каждые последующие = к 5 годам жизни человека.*/
public class Pet {
    private String petName;
    private String petType;
    private int animalAge;

    public Pet(String petName, String petType, int animalAge) {
        this.petName = petName;
        this.petType = petType;
        this.animalAge = animalAge;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int convertAnimalYearsToHumanYears() {
        int age = this.animalAge;
        if (this.petType.equals("dog")) {
            int petHumanAge = 24;
            if (animalAge == 1) {
                return 15;
            }
            else if (animalAge == 2) {
                return 24;
            }
            else {
                for (int i = 3; i <= animalAge; i++) {
                    petHumanAge += 5;
                }
                return petHumanAge;
            }
        }
        else {
            int petHumanAge = 0;
            for (int i = 1; i <= animalAge; i++) {
                petHumanAge += 7;
            }
            return petHumanAge;
        }
    }



    @Override
    public String toString() {
        return petName + " " + petType + " " + animalAge;
    }
}
