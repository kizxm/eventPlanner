package models;

public class Event {
    private int partyGuests;
    private String partyDrinks;
    private String partyLocation;
    private String partyEntertainment;

    public Event(int partyGuests, String partyDrinks, String partyLocation, String partyEntertainment) {
        this.partyGuests = partyGuests;
        this.partyDrinks = partyDrinks;
        this.partyLocation = partyLocation;
        this.partyEntertainment = partyEntertainment;
    }
//
//    public int partyCost() {
//        return ((this.partyDrinks * 20) + (this.partyGuests * 2) + (this.partyLocation * 50) + (this.partyEntertainment * 250) + 10);
//    }
//
//    public int partyCouponCost1() {
//        return ((partyCost() - 500));
//    }
//    public int partyCouponCost2() {
//        return ((partyCost() - 20));
//    }

/// getters ///
    public int getPartyGuests() {
        return partyGuests;
    }
    public String getPartyDrinks() {
        return partyDrinks;
    }
    public String getPartyLocation() {
        return partyLocation;
    }
    public String getPartyEntertainment() {
        return partyEntertainment;
    }
//////////////
}

