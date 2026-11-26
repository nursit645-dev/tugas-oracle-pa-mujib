package latihan5_1;

import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double num1 = in.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = in.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char operator = in.next().charAt(0);

        if (operator == '+') {
            System.out.println("Hasil: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Hasil: " + (num1 / num2));
        } else if (operator == '%') {
            System.out.println("Hasil: " + (num1 % num2));
        } else {
            System.out.println("Operator tidak valid!");
        }

        in.close();
    }
}