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

    public int drinkCost(String partyDrinks) {
        int totalDrinkCost = 0;
        switch (partyDrinks) {
            case "alcoholic":
                totalDrinkCost = 9;
                break;
            case "non-alcoholic":
                totalDrinkCost = 4;
                break;
            case "both":
                totalDrinkCost = 13;
                break;
        }
        return totalDrinkCost;
    }

    public int entertainmentCost(String partyEntertainment) {
        int totalEntertainmentCost = 0;
        switch (partyEntertainment) {
            case "bring your own":
                totalEntertainmentCost = 10;
                break;
            case "DJ":
                totalEntertainmentCost = 150;
                break;
            case "live band":
                totalEntertainmentCost = 300;
                break;
        }
        return totalEntertainmentCost;
    }

/// calculation methods ///

    public int fullCatering(int foodCost, int drinkCost) {
    int cateringForAll = foodCost + drinkCost;
    return cateringForAll;
}

//////////////
///-------------------------------------------------------------------
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

