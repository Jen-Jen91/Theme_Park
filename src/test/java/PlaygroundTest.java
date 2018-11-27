import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        playground = new Playground("Adventure Land");
        visitor1 = new Visitor("Jack", 12, 130, 2);
        visitor2 = new Visitor("Jill", 16, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Adventure Land", playground.getName());
    }

    @Test
    public void visitorUnder15Allowed() {
        assertEquals(true, playground.isAllowed(visitor1));
    }

    @Test
    public void visitorOver15NotAllowed() {
        assertEquals(false, playground.isAllowed(visitor2));
    }

}
