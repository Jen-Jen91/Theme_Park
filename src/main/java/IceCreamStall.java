public class IceCreamStall extends Stall {

    public IceCreamStall(String name, int rating, String ownerName, int parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 2.80;
    }

}
