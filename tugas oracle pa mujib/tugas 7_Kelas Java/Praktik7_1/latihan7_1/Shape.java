package latihan7_1;

public class Shape {
    private int numSides;
    private boolean regular;

    // Constructor 1 (default)
    public Shape() {
        this.numSides = 4;
        this.regular = true;
    }

    // Constructor 2 (dengan parameter)
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}