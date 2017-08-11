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
        assertEquals(5, testEvent.entertainmentCost(testEvent.getPartyEntertainment()));
    }

}