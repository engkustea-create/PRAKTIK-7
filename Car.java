public class Car extends Vehicle {
    private int numDoors;

    public Car(int numWheels, int numDoors) {
        super(numWheels);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}