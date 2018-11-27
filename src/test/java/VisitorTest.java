import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Steve", 32, 185.42, 45);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", visitor.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(32, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(185.42, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney() {
        assertEquals(45, visitor.getMoney(), 0.01);
    }

}
