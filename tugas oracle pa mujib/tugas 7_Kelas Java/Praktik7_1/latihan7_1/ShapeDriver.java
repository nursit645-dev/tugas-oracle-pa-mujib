package latihan7_1;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(3, false);

        System.out.println("Shape 1 -> Jumlah sisi: " + s1.getNumSides() + ", Beraturan: " + s1.isRegular());
        System.out.println("Shape 2 -> Jumlah sisi: " + s2.getNumSides() + ", Beraturan: " + s2.isRegular());
    }
}