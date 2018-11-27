import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Oblivion");
    }

    @Test
    public void hasName() {
        assertEquals("Oblivion", rollercoaster.getName());
    }

}
