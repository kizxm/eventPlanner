package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void eventAddsCorrectly () throws Exception {
        Event testEvent = new Event(2, 2);
        assertEquals(14, testEvent.partyCost());
    }


}