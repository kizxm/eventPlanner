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
        assertEquals(8, testEvent.drinkCost(testEvent.getPartyDrinks()));
    }


//    @Test
//    public void eventAddsCorrectly2 () throws Exception {
//        Event testEvent = new Event (5, 2,3, 1);
//        assertEquals(460, testEvent.partyCost());
//    }
//
//    @Test
//    public void eventAddsCorrectly3 () throws Exception {
//        Event testEvent = new Event (5, 2,3, 3);
//        assertEquals(43, testEvent.partyCost());
//    }



}