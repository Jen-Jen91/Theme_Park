public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }

}
