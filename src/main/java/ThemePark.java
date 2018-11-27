import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewed = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Attraction> getAttractions() {
        return this.attractions;
    }

    public ArrayList<Stall> getStalls() {
        return this.stalls;
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public String visit(Visitor visitor, Attraction attraction) {
        return visitor.getName() + " is visiting " + attraction.getName();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewed;
    }

    public void addReviewed(IReviewed reviewed) {
        this.reviewed.add(reviewed);
    }
}
