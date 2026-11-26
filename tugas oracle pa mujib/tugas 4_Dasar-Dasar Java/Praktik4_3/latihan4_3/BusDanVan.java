package latihan4_3;

import java.util.Scanner;

public class BusDanVan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int kapasitasBus = 45;

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int jumlahOrang = in.nextInt();

        int jumlahBus = jumlahOrang / kapasitasBus;
        int sisaVan = jumlahOrang % kapasitasBus;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Jumlah orang yang naik van: " + sisaVan);

        in.close();
    }
}