import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Oblivion", 7);
        visitor1 = new Visitor("Bella", 13, 150, 5);
        visitor2 = new Visitor("Milo", 11, 160, 5);
        visitor3 = new Visitor("Fizz", 14, 140, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Oblivion", rollercoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, rollercoaster.getRating());
    }

    @Test
    public void visitorOver145And12Allowed() {
        assertEquals(true, rollercoaster.isAllowed(visitor1));
    }

    @Test
    public void visitorUnder12NotAllowed() {
        assertEquals(false, rollercoaster.isAllowed(visitor2));
    }

    @Test
    public void visitorUnder145NotAllowed() {
        assertEquals(false, rollercoaster.isAllowed(visitor3));
    }

}
