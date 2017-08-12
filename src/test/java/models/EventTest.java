package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void testEvent_InstantiatesCorrectly() throws Exception {
        Event testEvent = new Event(2, "test", "test2", "test3");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void totalFoodCost_Returned_8() throws Exception {
        Event testEvent = new Event(99, "small snacks", "test","test2");
        assertEquals(8, testEvent.foodCost(testEvent.getPartyFood()));
    }

    @Test
    public void totalDrinkCost_Returned_9() throws Exception {
        Event testEvent = new Event(101, "test", "alcoholic", "test2");
        assertEquals(9, testEvent.drinkCost(testEvent.getPartyDrinks()));
    }

    @Test
    public void returnFullCatering_21() throws Exception {
        Event testEvent = new Event(102, "small snacks", "both", "test");
        assertEquals(21, testEvent.fullCatering(testEvent.foodCost(testEvent.getPartyFood()),testEvent.drinkCost(testEvent.getPartyDrinks())));
    }

    @Test
    public void totalEntertainmentCostReturned_10() throws Exception {
        Event testEvent = new Event(103, "starve", "non-alcoholic", "bring your own");
        assertEquals(10, testEvent.entertainmentCost(testEvent.getPartyEntertainment()));
    }

    @Test
    public void testEvent_calculateCost_16300() throws Exception {
        Event testEvent = new Event (100, "starve", "both", "DJ");
        assertEquals(16300, testEvent.totalCostNoCoupon(13, 150, 100));
    }

    @Test
    public void testEvent_testCouponCode_800() throws Exception {
        Event testEvent = new Event(50, "starve", "alcoholic", "bring your own");
        assertEquals(10, testEvent.oneHundred(950));
    }

}
