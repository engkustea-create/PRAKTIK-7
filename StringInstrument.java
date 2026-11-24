public class StringInstrument extends Instrument {
    private int numStrings;

    public StringInstrument(double price, boolean onSale, int numStrings) {
        super(price, onSale);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
}