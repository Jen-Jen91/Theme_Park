import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCream;

    @Before
    public void before() {
        iceCream = new IceCreamStall("Frosty", 8,"Sarah", 121);
    }

    @Test
    public void hasName() {
        assertEquals("Frosty", iceCream.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(8, iceCream.getRating());
    }

    @Test
    public void hasOwner() {
        assertEquals("Sarah", iceCream.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(121, iceCream.getParkingSpot());
    }

    @Test
    public void hasPrice() {
        assertEquals(2.80, iceCream.defaultPrice(), 0.01);
    }
}
