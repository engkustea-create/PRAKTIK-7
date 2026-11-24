public class Guitar extends StringInstrument {
    private String woodType;

    public Guitar(double price, boolean onSale, int numStrings, String woodType) {
        super(price, onSale, numStrings);
        this.woodType = woodType;
    }

    public String getWoodType() {
        return woodType;
    }
}