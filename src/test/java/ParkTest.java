import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Green Park");
    }

    @Test
    public void hasName() {
        assertEquals("Green Park", park.getName());
    }

}
