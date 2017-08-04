package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void eventAddsCorrectly () throws Exception {
        Event testEvent = new Event(2, 2, 2, 1);
        assertEquals(404, testEvent.partyCost());
    }

    @Test
    public void eventAddsCorrectly2 () throws Exception {
        Event testEvent = new Event (5, 2,3, 1);
        assertEquals(460, testEvent.partyCost());
    }

    @Test
    public void eventAddsCorrectly3 () throws Exception {
        Event testEvent = new Event (5, 2,3, 3);
        assertEquals(43, testEvent.partyCost());
    }

}