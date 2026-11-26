package latihan7_4;

public class Instrument {
    protected String name;
    protected double price;
    protected boolean onSale;

    public Instrument(String name, double price, boolean onSale) {
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice() {
        if (onSale) {
            return price * 0.85; // 15% lebih murah saat onSale
        }
        return price;
    }

    public double getEmployeeDiscountPrice() {
        return getPrice() * 0.75; // Diskon karyawan 25% (75% dari harga)
    }

    public String getName() {
        return name;
    }
}