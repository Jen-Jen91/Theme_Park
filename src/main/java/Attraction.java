public abstract class Attraction implements IReviewed{

    protected String name;
    protected int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public String getName() {
        return this.name;
    }

}
