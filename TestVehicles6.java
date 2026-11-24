public class TestVehicles6 {
    public static void main(String[] args) {
        Convertible conv = new Convertible(4, 2, true);
        Bicycle bike = new Bicycle(2, true);

        System.out.println("Convertible -> Roda: " + conv.getNumWheels()
                + ", Pintu: " + conv.getNumDoors()
                + ", Atap terbuka: " + conv.isRoofOpen());
        System.out.println("Bicycle -> Roda: " + bike.getNumWheels()
                + ", Punya bel: " + bike.hasBell());
    }
}