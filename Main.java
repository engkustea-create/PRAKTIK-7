import java.util.Scanner;

class Card {

    String suit, name;
    int points;

    // Constructor
    Card(int n1, int n2) {

        String[] suits = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] names = {
            "", "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"
        };

        suit = suits[n1 - 1];
        name = names[n2];

        if (n2 == 1) {
            points = 1;
        } else if (n2 >= 11) {
            points = 10;
        } else {
            points = n2;
        }
    }

    // Method menampilkan nama kartu
    public String toString() {
        return "The " + name + " of " + suit;
    }

    // Getter
    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Card[] hand = new Card[5];

        int totalPoin = 0;
        int jumlahKartu = 0;
        String jawaban = "y";

        // Mengambil dua kartu pertama
        for (int i = 0; i < 2; i++) {

            int suitNumber =
                (int)(Math.random() * 4) + 1;

            int faceNumber =
                (int)(Math.random() * 13) + 1;

            hand[i] = new Card(suitNumber, faceNumber);

            totalPoin += hand[i].getPoints();
            jumlahKartu++;
        }

        // Menampilkan dua kartu pertama
        System.out.println("=== PERMAINAN KARTU ===");

        for (int i = 0; i < jumlahKartu; i++) {
            System.out.println(hand[i] +
                " - Poin: " + hand[i].getPoints());
        }

        System.out.println("Total Poin: " + totalPoin);

        // Loop mengambil kartu tambahan
        while (totalPoin <= 21 &&
               jumlahKartu < 5 &&
               jawaban.equalsIgnoreCase("y")) {

            System.out.print(
                "Apakah ingin mengambil kartu lagi? (y/n): "
            );

            jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("y")) {

                int suitNumber =
                    (int)(Math.random() * 4) + 1;

                int faceNumber =
                    (int)(Math.random() * 13) + 1;

                hand[jumlahKartu] =
                    new Card(suitNumber, faceNumber);

                totalPoin +=
                    hand[jumlahKartu].getPoints();

                jumlahKartu++;

                System.out.println("\nKartu baru:");

                // Menampilkan semua kartu
                for (int i = 0; i < jumlahKartu; i++) {
                    System.out.println(hand[i] +
                        " - Poin: " +
                        hand[i].getPoints());
                }

                System.out.println(
                    "Total Poin: " + totalPoin
                );
            }
        }

        // Hasil akhir
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Jumlah Kartu: " + jumlahKartu);
        System.out.println("Total Poin: " + totalPoin);

        if (totalPoin > 21) {
            System.out.println("Poin melebihi 21!");
        } else {
            System.out.println("Permainan selesai!");
        }

        input.close();
    }
}