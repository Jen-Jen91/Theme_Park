public abstract class Stall implements IReviewed{

    protected String name;
    protected int rating;
    protected String ownerName;
    protected int parkingSpot;

    public Stall(String name, int rating, String ownerName, int parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getParkingSpot() {
        return this.parkingSpot;
    }
}
