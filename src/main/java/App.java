import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Kira's Party Planning! Let's plan your party! >>> 'plan party', or 'exit'.");

            try {
                String navigationChoice = bufferedReader.readLine();
                if (navigationChoice.equals("plan party")) {
                    Event newParty = new Event(1, "empty", "empty", "empty");

                    System.out.println("What kind of food service would you like? 'starve', 'small snacks', 'full dinner'");
                    newParty.setPartyFood(bufferedReader.readLine());
                    int mealCost = newParty.foodCost(newParty.getPartyFood());

                    System.out.println("What kind of drinks? 'alcoholic', 'non-alcoholic', or 'both'?");
                    newParty.setPartyDrinks(bufferedReader.readLine());
                    int beverageCost = newParty.drinkCost(newParty.getPartyDrinks());

                    System.out.println("How many in your Party?");
                    newParty.setPartyGuests(Integer.parseInt(bufferedReader.readLine()));

                    System.out.println("What would like for entertainment? Bring your own, DJ, or live band?");
                    newParty.setPartyEntertainment(bufferedReader.readLine());
                    int amusementCost = newParty.entertainmentCost(newParty.getPartyEntertainment());


                    int totalCost = newParty.totalCostNoCoupon(mealCost, beverageCost, amusementCost);
                    System.out.println(" ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
                    System.out.println(String.format("Your current total price is $%d.\n", totalCost));
                    System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
                    System.out.println("Would you like to use one of the following discount codes? -> 'PARTYover150', '150OFF', 'exit'. ");

                    String coupon = bufferedReader.readLine();
                    if (coupon.equals("150OFF")) {
                        int newTotal = newParty.oneHundred(totalCost);
                        System.out.println(String.format("New Total is: $%d ", newTotal));
                        System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
                        System.out.println("Thank you! -> 'exit'");
                    } else if (coupon.equals("PARTYover150")){
                        String holder = newParty.largeParty(totalCost);
                        System.out.println(holder);
                    }
                    }

                else if (navigationChoice.equals("exit")) {
                    System.out.println("See you next time!");
                    programRunning = false;
                }

            } catch (IOException e) {
                e.printStackTrace();
//            }
            }

        }
    }
}