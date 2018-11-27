import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFloss;

    @Before
    public void before() {
        candyFloss = new CandyFlossStall("Fluffy", 9,"Luna", 105);
    }

    @Test
    public void hasName() {
        assertEquals("Fluffy", candyFloss.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, candyFloss.getRating());
    }

    @Test
    public void hasOwner() {
        assertEquals("Luna", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(105, candyFloss.getParkingSpot());
    }

    @Test
    public void hasPrice() {
        candyFloss.setPrice(4.20);
        assertEquals(4.20, candyFloss.defaultPrice(), 0.01);
    }

}
