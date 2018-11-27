import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Smokey", "Bob", 65);
    }

    @Test
    public void hasName() {
        assertEquals("Smokey", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Bob", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(65, tobaccoStall.getParkingSpot());
    }

}
