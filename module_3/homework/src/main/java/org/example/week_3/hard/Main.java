package org.example.week_3.hard;

public class Main {

    public static void main(String[] args) {
        /*
        Dog dog = new Dog("James", "dog", 5, "bone");
        System.out.println(dog.convertAnimalYearsToHumanYears());
        Bird bird = new Bird("Jameson", "bird", 5, 40);
        System.out.println(bird.convertAnimalYearsToHumanYears());
*/

        GymMembership standardMember = new GymMembership("Eddie", "standard", 6);
        System.out.println(standardMember.calculateMembershipCost() + " tenge");
        standardMember.checkSpecialOffers();
        System.out.println();

        PremiumMembership premiumMember = new PremiumMembership("Mike", "premium", 6, true, true);
        System.out.println(premiumMember.calculateMembershipCost() + " tenge");
        premiumMember.checkSpecialOffers();
    }
}
