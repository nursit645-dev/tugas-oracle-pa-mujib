package latihan5_1;

import java.util.Scanner;

public class HitungCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = in.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = in.nextDouble();

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = in.nextDouble();

        // Luas 4 dinding + langit-langit (tanpa lantai)
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        double luasLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangit;

        // Ember 5L = 1500 sq ft ($15), Ember 1L = 300 sq ft ($4)
        int ember5Liter = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;
        int ember1Liter = (int) Math.ceil(sisaLuas / 300.0);

        // Optimasi biaya: jika butuh 4 atau 5 ember 1L ($16-$20), lebih murah beli 1 ember 5L ($15)
        if (ember1Liter >= 4) {
            ember5Liter++;
            ember1Liter = 0;
        }

        int totalBiaya = (ember5Liter * 15) + (ember1Liter * 4);

        System.out.println("Total luas area yang dicat: " + totalLuas + " kaki persegi");
        System.out.println("Jumlah optimal ember 5 liter ($15): " + ember5Liter);
        System.out.println("Jumlah optimal ember 1 liter ($4): " + ember1Liter);
        System.out.println("Total biaya cat: $" + totalBiaya);

        in.close();
    }
}