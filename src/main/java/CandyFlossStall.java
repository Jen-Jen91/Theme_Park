public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, int rating, String ownerName, int parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 4.20;
    }

}
