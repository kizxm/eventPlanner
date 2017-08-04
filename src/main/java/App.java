import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Event> partyDetails = new ArrayList<>();

        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Kira's Party Planning! Let's plan your party! >>> 'Plan Party', 'Party Cost', 'Use a Coupon', or 'Exit'.");

            try {

                String navigationChoice = bufferedReader.readLine();
                if (navigationChoice.equals("Plan Party")) {
                    System.out.println("How many guests?");
                    int inputGuests = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("What kind of drinks? Please enter a number matching your choice; Alcoholic(1), Non-Alcoholic(2), or Both(3)?");
                    int inputDrink = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Outdoors(1) or Indoors(2)?");
                    int inputLocation = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("What would like for entertainment? Bring Your Own(1), DJ(2), Live Band(3)?");
                    int inputEntertainment = Integer.parseInt(bufferedReader.readLine());
                    Event newEvent = new Event(inputGuests, inputDrink, inputLocation, inputEntertainment);
                    partyDetails.add(newEvent);
                }

//                currently, non-functional; was trying to create a separate selection for entertainment selection that would convert
//                a string into an integer that could then be added to my partyCost method.
//
//                else if (navigationChoice.equals("Hire Entertainment")) {
//                    System.out.println("What kind of entertainment would you like? 'DJ', 'Band', or 'Bring your Own'?");
//                    if (bufferedReader.readLine().equals("DJ")) {
//                        int entertainType1 = 500;
//                    } else if (bufferedReader.readLine().equals("Band")) {
//                        int entertainType2 = 1000;
//                    } else if (bufferedReader.readLine().equals("Bring You Own")) {
//                        int entertainType3 = 0;
//                    } else {
//                        System.out.println("Error");
//                    }
//                }

                else if (navigationChoice.equals("Party Cost")){
                    for (Event oneEvent : partyDetails) {
                        int eventCost = oneEvent.partyCost();
                        System.out.println("----------------------");
                        System.out.println("$" + eventCost );
                    }
                }

                else if (navigationChoice.equals("Use a Coupon")) {
                    for (Event discountEvent1 : partyDetails) {
                        int eventCost1 = discountEvent1.partyCouponCost1();

                        for (Event discountEvent2 : partyDetails) {
                            int eventCost2 = discountEvent2.partyCouponCost2();

                            System.out.println("Apply a coupon?; '1FREEDJ', '$20OFF'");
                            if (bufferedReader.readLine().equals("1FREEDJ")) {
                                System.out.println(String.format("New total with Coupon: ", eventCost1));
                            } else if (bufferedReader.readLine().equals("$20OFF")) ;
                            {
                                System.out.println(String.format("New total with Coupon:", eventCost2));
                            }
                        }
                    }
                }

                else if (navigationChoice.equals("Exit")) {
                    System.out.println("See you next time!");
                    programRunning = false;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}