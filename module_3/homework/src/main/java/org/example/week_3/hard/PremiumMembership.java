package org.example.week_3.hard;

public class PremiumMembership extends GymMembership {
    private Boolean hasTrainer;
    private Boolean hasSpaAccess;

    public PremiumMembership(String name, String membershipType, int duration, boolean hasTrainer, boolean hasSpaAccess) {
        super(name, membershipType, duration);
        this.hasTrainer = hasTrainer;
        this.hasSpaAccess = hasSpaAccess;
    }


    @Override
    public int calculateMembershipCost() {
        int baseCost = super.calculateMembershipCost();
        int trainerCost = hasTrainer ? 7000 * (getMembershipDurationInMonths() / 3) : 0;
        int spaCost = hasSpaAccess ? 5000 * (getMembershipDurationInMonths() / 3) : 0;
        return baseCost + trainerCost + spaCost;
    }

}
