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

    public int totalCostNoCoupon(int fullCatering, int entertainmentCost, int partyGuests){
        int totalCost = (fullCatering + entertainmentCost) * partyGuests;
        return totalCost;
    }

    public int oneHundred(int totalCostNoCoupon) {
        int offTotal = (totalCostNoCoupon -150);
        return offTotal;
    }

    public String largeParty(int totalCost) {
        String holder = "";
        if(totalCost < 2850) {
            holder = "Party is not large enough for this code.";
        } else if (totalCost >= 2850) {
            holder = "Coupon added.";
        }
        return holder;
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
///-------------------------------------------------------------------
/// setters ///
    public void setPartyGuests(int partyGuests) {
    this.partyGuests = partyGuests;
    }
    public void setPartyDrinks(String partyDrinks) {
        this.partyDrinks = partyDrinks;
    }
    public void setPartyFood(String partyFood) {
        this.partyFood = partyFood;
    }
    public void setPartyEntertainment(String partyEntertainment) {
        this.partyEntertainment = partyEntertainment;
    }
//////////////
}

