package latihan5_1;

import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double num1 = in.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = in.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char operator = in.next().charAt(0);

        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                hasil = num1 + num2;
                break;
            case '-':
                hasil = num1 - num2;
                break;
            case '*':
                hasil = num1 * num2;
                break;
            case '/':
                hasil = num1 / num2;
                break;
            case '%':
                hasil = num1 % num2;
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

        in.close();
    }
}