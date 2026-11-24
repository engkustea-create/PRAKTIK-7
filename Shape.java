public class Shape {

    // Instance Variable
    int numSides;
    boolean regular;

    // Constructor pertama
    public Shape() {
        numSides = 0;
        regular = false;
    }

    // Constructor kedua
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter
    public int getNumSides() {
        return numSides;
    }

    public boolean getRegular() {
        return regular;
    }

    // Setter
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    // Main Method
    public static void main(String[] args) {

        Shape bentuk = new Shape(4, true);

        System.out.println("Jumlah Sisi: " + bentuk.getNumSides());
        System.out.println("Bentuk Beraturan: " + bentuk.getRegular());

    }
}