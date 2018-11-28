public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, int rating, String ownerName, int parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return 6.60;
    }

}
