public class Fish {

    // Instance Variable
    String typeOfFish;
    int friendliness;

    // Constructor pertama
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Constructor kedua
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Getter
    public int getFriendliness() {
        return friendliness;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    // Method nicestFish dengan Variable Argument
    public static Fish nicestFish(Fish... fishes) {

        Fish temp = fishes[0];

        for (int i = 1; i < fishes.length; i++) {

            if (fishes[i].getFriendliness() >
                temp.getFriendliness()) {

                temp = fishes[i];
            }
        }

        return temp;
    }

    // Main Method
    public static void main(String[] args) {

        // Membuat dua objek ikan
        Fish fish1 = new Fish("AngelFish", 5);
        Fish fish2 = new Fish("Guppy", 3);

        // Menampilkan ikan pertama
        System.out.println("=== DATA IKAN ===");

        System.out.println("Ikan 1: Amber");
        System.out.println("Jenis: " + fish1.getTypeOfFish());
        System.out.println("Keramahan: " + fish1.getFriendliness());

        System.out.println();

        // Menampilkan ikan kedua
        System.out.println("Ikan 2: James");
        System.out.println("Jenis: " + fish2.getTypeOfFish());
        System.out.println("Keramahan: " + fish2.getFriendliness());

        // Mencari ikan paling ramah
        Fish hasil = nicestFish(fish1, fish2);

        System.out.println("\n=== IKAN PALING RAMAH ===");

        if (hasil == fish1) {
            System.out.println("Ikan paling ramah adalah Amber");
        } else {
            System.out.println("Ikan paling ramah adalah James");
        }

        System.out.println("Jenis ikan: " + hasil.getTypeOfFish());
        System.out.println("Tingkat keramahan: " + hasil.getFriendliness());
    }
}