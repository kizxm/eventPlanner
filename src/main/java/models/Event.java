package models;

public class Event {
    private int partyGuests;
    private int partyDrinks;
    private int partyLocation;

    public Event(int partyGuests, int partyDrinks, int partyLocation) {
        this.partyGuests = partyGuests;
        this.partyDrinks = partyDrinks;
        this.partyLocation = partyLocation;

    }
    public int partyCost() {
        return ((this.partyDrinks * 20) + (this.partyGuests * 2) + (this.partyLocation * 50) + 10);
    }
}
