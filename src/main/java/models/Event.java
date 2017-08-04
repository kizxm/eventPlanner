package models;

public class Event {
    private int partyGuests;
    private int partyDrinks;
    private int partyLocation;
    private int partyEntertainment;

    public Event(int partyGuests, int partyDrinks, int partyLocation, int partyEntertainment) {
        this.partyGuests = partyGuests;
        this.partyDrinks = partyDrinks;
        this.partyLocation = partyLocation;
        this.partyEntertainment = partyEntertainment;

    }
    public int partyCost() {
        return ((this.partyDrinks * 20) + (this.partyGuests * 2) + (this.partyLocation * 50) + (this.partyEntertainment * 250) + 10);
    }
}
