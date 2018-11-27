import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars", 8);
        visitor = new Visitor("Jill", 11, 130, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(8, dodgems.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void halfPriceForYoungVisitor() {
        assertEquals(2.25, dodgems.priceFor(visitor), 0.01);
    }

}
