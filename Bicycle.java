public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(int numWheels, boolean hasBell) {
        super(numWheels);
        this.hasBell = hasBell;
    }

    public boolean hasBell() {
        return hasBell;
    }
}