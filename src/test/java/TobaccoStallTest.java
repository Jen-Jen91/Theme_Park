import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Smokey", 4,"Bob", 65);
        visitor1 = new Visitor("Jack", 19, 175, 25);
        visitor2 = new Visitor("Jill", 15, 155, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Smokey", tobaccoStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(4, tobaccoStall.getRating());
    }

    @Test
    public void hasOwner() {
        assertEquals("Bob", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(65, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorOver18Allowed() {
        assertEquals(true, tobaccoStall.isAllowed(visitor1));
    }

    @Test
    public void visitorUnder18NotAllowed() {
        assertEquals(false, tobaccoStall.isAllowed(visitor2));
    }

    @Test
    public void hasPrice() {
        tobaccoStall.setPrice(6.60);
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.01);
    }
}
