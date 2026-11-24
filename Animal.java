public class Animal {

    int weight, height;
    double speed;

    // Constructor pertama
    Animal() {
        weight = 50;
        height = 4;
        speed = 2;
    }

    // Constructor kedua
    Animal(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    // Method Getter
    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getTime(double miles) {
        return miles / speed;
    }

    // Main Method
    public static void main(String[] args) {

        // Membuat dua instance Animal
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(60, 5, 10);

        // Mencetak kecepatan
        System.out.println("Animal #1 memiliki kecepatan " 
                + animal1.getSpeed());

        System.out.println("Animal #2 memiliki kecepatan " 
                + animal2.getSpeed());
    }
}