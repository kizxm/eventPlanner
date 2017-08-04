package models;

public class Event {
    public int partyGuests;
    public int partyDrinks;

    public Event(int partyGuests, int partyDrinks) {
        this.partyGuests = partyGuests;
        this.partyDrinks = partyDrinks;
    }


    public int partyCost() {
        return ((this.partyDrinks) + (this.partyGuests) + 10);
    }
}
