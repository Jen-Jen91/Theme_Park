import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction attraction1;
    Attraction attraction2;
    Stall stall1;
    Stall stall2;
    Stall stall3;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers");
        attraction1 = new Rollercoaster("Air", 8);
        attraction2 = new Dodgems("Bumpers", 6);
        stall1 = new IceCreamStall("Frosty", 9, "Sarah", 50);
        stall2 = new CandyFlossStall("Fluffy", 8, "Luna", 90);
        stall3 = new TobaccoStall("Smokey", 4, "Bob", 101);
        visitor1 = new Visitor("Steve", 31, 183, 45);
        visitor2 = new Visitor("Jill", 15, 150, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Alton Towers", themePark.getName());
    }

    @Test
    public void canCreateVisits() {
        assertEquals("Steve is visiting Air", themePark.visit(visitor1, attraction1));
    }

    @Test
    public void hasReviewed() {
        themePark.addReviewed(attraction1);
        themePark.addReviewed(stall1);
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        reviewed.add(attraction1);
        reviewed.add(stall1);
        assertEquals(reviewed, themePark.getAllReviewed());
    }

    @Test
    public void testReport() {
        themePark.addReviewed(attraction1);
        themePark.addReviewed(attraction2);
        themePark.addReviewed(stall1);
        themePark.addReviewed(stall2);
        String expectedReport = "Air : 8, Bumpers : 6, Frosty : 9, Fluffy : 8, ";
        assertEquals(expectedReport, themePark.reportReviewed());
    }

    @Test
    public void testGetAllAllowed() {
        themePark.addReviewed(attraction1);
        themePark.addReviewed(attraction2);
        themePark.addReviewed(stall1);
        themePark.addReviewed(stall2);
        themePark.addReviewed(stall3);
        assertEquals(2, themePark.getAllAllowedFor(visitor1).size());
        //Only two of these have ISecurity and visitor is allowed in both, so only 2 in new array
    }

    @Test
    public void testGetAllAllowedForYoungVisitor() {
        themePark.addReviewed(attraction1);
        themePark.addReviewed(attraction2);
        themePark.addReviewed(stall1);
        themePark.addReviewed(stall2);
        themePark.addReviewed(stall3);
        assertEquals(1, themePark.getAllAllowedFor(visitor2).size());
        //Only two of these have ISecurity and visitor is only allowed in 1, so only 1 in new array
    }

}
