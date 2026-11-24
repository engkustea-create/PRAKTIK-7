public class Instrument {
    private double price;
    private boolean onSale;

    public Instrument(double price, boolean onSale) {
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice() {
        if (onSale) {
            return price * 0.85; // diskon 15% saat onSale
        }
        return price;
    }

    public double getEmployeePrice() {
        return getPrice() * 0.75; // diskon karyawan 25% (75% dari harga)
    }

    public boolean isOnSale() {
        return onSale;
    }
}