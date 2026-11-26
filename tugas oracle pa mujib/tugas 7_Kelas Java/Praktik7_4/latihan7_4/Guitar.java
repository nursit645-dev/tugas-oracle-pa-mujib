package latihan7_4;

public class Guitar extends StringInstrument {
    private String bodyType;

    public Guitar(String name, double price, boolean onSale, int numStrings, String bodyType) {
        super(name, price, onSale, numStrings);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
}