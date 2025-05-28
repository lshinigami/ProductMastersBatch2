package org.example.week_3.hard;

public class GymMembership {
    private String name;
    private String membershipType;
    private int membershipDurationInMonths;

    public GymMembership(String name, String membershipType, int membershipDurationInMonths) {
        this.name = name;
        this.membershipType = membershipType;
        this.membershipDurationInMonths = membershipDurationInMonths;
    }

    public int calculateMembershipCost() {
        int cost = 0;
        int duration = this.membershipDurationInMonths;
        cost = (duration / 3) * 10000; //3 month cost = 10.000 tenge
        return cost;
    }

    public void checkSpecialOffers() {
        if (membershipType.equalsIgnoreCase("premium")) {
            System.out.println("SALE for Drinks every wednesday & saturday");
        }
        else {
            System.out.println("First lesson with trainer is FREE");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getMembershipDurationInMonths() {
        return membershipDurationInMonths;
    }

    public void setMembershipDurationInMonths(int membershipDurationInMonths) {
        this.membershipDurationInMonths = membershipDurationInMonths;
    }
}
