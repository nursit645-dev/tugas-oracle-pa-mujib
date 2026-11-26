package latihan6_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenangananException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan pembilang: ");
            int pembilang = in.nextInt();

            System.out.print("Masukkan penyebut: ");
            int penyebut = in.nextInt();

            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol (ArithmeticException).");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa bilangan bulat (InputMismatchException).");
        } finally {
            System.out.println("Program tetap berjalan dengan aman.");
            in.close();
        }
    }
}