package latihan7_5;

public class FactorialDemo {
    public int num;

    public FactorialDemo(int num) {
        this.num = num;
    }

    public int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder deret = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            deret.append(i);
            if (i < num) {
                deret.append("*");
            }
        }
        return "Factorial: " + num + "! = " + deret.toString() + " = " + getFactorial();
    }

    public static void main(String[] args) {
        FactorialDemo f = new FactorialDemo(10);
        System.out.println(f.toString());
    }
}