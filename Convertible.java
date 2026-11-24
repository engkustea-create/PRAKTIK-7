public class Convertible extends Car {
    private boolean roofOpen;

    public Convertible(int numWheels, int numDoors, boolean roofOpen) {
        super(numWheels, numDoors);
        this.roofOpen = roofOpen;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }
}