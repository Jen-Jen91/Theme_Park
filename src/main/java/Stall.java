public abstract class Stall implements IReviewed, ITicketed{

    protected String name;
    protected int rating;
    protected String ownerName;
    protected int parkingSpot;
    protected double price;

    public Stall(String name, int rating, String ownerName, int parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.price = 0;
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

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
