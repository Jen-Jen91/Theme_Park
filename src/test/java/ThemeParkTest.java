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
    Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers");
        attraction1 = new Rollercoaster("Air", 8);
        attraction2 = new Dodgems("Bumpers", 6);
        stall1 = new IceCreamStall("Frosty", 9, "Sarah", 50);
        stall2 = new CandyFlossStall("Fluffy", 8, "Luna", 90);
        visitor = new Visitor("Steve", 31, 183, 45);
    }

    @Test
    public void hasName() {
        assertEquals("Alton Towers", themePark.getName());
    }

    @Test
    public void hasAttractions() {
        themePark.addAttraction(attraction1);
        themePark.addAttraction(attraction2);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(attraction1);
        attractions.add(attraction2);
        assertEquals(attractions, themePark.getAttractions());
    }

    @Test
    public void hasStalls() {
        themePark.addStall(stall1);
        themePark.addStall(stall2);
        ArrayList<Stall> stalls = new ArrayList<>();
        stalls.add(stall1);
        stalls.add(stall2);
        assertEquals(stalls, themePark.getStalls());
    }

    @Test
    public void canCreateVisits() {
        assertEquals("Steve is visiting Air", themePark.visit(visitor, attraction1));
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


}
