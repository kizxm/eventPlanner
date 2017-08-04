package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void eventAddsCorrectly () throws Exception {
        Event testEvent = new Event(2, 2, 2);
        assertEquals(154, testEvent.partyCost());
    }

    @Test
    public void eventAddsCorrectly2 () throws Exception {
        Event testEvent = new Event (5, 2,3);
        assertEquals(43, testEvent.partyCost());
    }

}