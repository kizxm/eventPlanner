package models;

public class Event {
    private int partyGuests;
    private String partyDrinks;
    private String partyFood;
    private String partyEntertainment;

    public Event(int partyGuests, String partyFood, String partyDrinks, String partyEntertainment) {
        this.partyGuests = partyGuests;
        this.partyFood = partyFood;
        this.partyDrinks = partyDrinks;
        this.partyEntertainment = partyEntertainment;
    }

    public int foodCost(String partyFood){
        int totalFoodCost =0;
        switch (partyFood) {
            case "starve": totalFoodCost = 0;
            break;
            case "small snacks": totalFoodCost = 8;
            break;
            case "full dinner": totalFoodCost = 15;
            break;
        }
        return totalFoodCost;
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
    public String getPartyFood() {
        return partyFood;
    }
    public String getPartyEntertainment() {
        return partyEntertainment;
    }
//////////////
}

