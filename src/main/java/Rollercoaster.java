public class Rollercoaster extends Attraction implements ISecurity, IReviewed{

    private double price;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return this.price * 2;
        }
        return this.price;
    }

}
