package org.example.hard;

public class Owner {
    private String ownerName;
    private int ownerAge;
    private String ownerContact;

    public Owner(String ownerName, int ownerAge, String ownerContact) {
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
        this.ownerContact = ownerContact;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }
}
