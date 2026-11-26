package latihan7_4;

public class MusicStoreDriver {
    public static void main(String[] args) {
        Guitar gitar = new Guitar("Fender Stratocaster", 200.0, true, 6, "Solid Body");
        System.out.println("Alat: " + gitar.getName() + " (" + gitar.getBodyType() + ", " + gitar.getNumStrings() + " senar)");
        System.out.println("Harga jual: $" + gitar.getPrice());
        System.out.println("Harga karyawan: $" + gitar.getEmployeeDiscountPrice());
    }
}