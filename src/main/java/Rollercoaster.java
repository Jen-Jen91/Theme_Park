public class Rollercoaster extends Attraction implements ISecurity{

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }
        return false;
    }

}
