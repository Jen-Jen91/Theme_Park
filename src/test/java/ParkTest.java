import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Green Park", 6);
    }

    @Test
    public void hasName() {
        assertEquals("Green Park", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(6, park.getRating());
    }

}
