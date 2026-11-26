package latihan6_1;

import java.util.Scanner;

public class KalkulatorMatriks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] matriksA = null;
        double[][] matriksB = null;
        char pilihan;

        do {
            System.out.println("\n=== MENU MATRIKS ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Character.toLowerCase(in.next().charAt(0));

            switch (pilihan) {
                case 'a':
                    matriksA = inputMatriks(in, "A");
                    break;
                case 'b':
                    matriksB = inputMatriks(in, "B");
                    break;
                case 'c':
                    if (cekMatriksSiap(matriksA, matriksB)) {
                        cetakMatriks(tambahMatriks(matriksA, matriksB));
                    }
                    break;
                case 'd':
                    if (cekMatriksSiap(matriksA, matriksB)) {
                        cetakMatriks(kurangMatriks(matriksA, matriksB));
                    }
                    break;
                case 'e':
                    if (cekMatriksSiap(matriksA, matriksB)) {
                        double[][] hasilKali = kaliMatriks(matriksA, matriksB);
                        if (hasilKali != null) {
                            cetakMatriks(hasilKali);
                        }
                    }
                    break;
                case 'f':
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 'f');

        in.close();
    }

    public static double[][] inputMatriks(Scanner in, String nama) {
        System.out.print("Masukkan jumlah baris Matriks " + nama + ": ");
        int baris = in.nextInt();
        System.out.print("Masukkan jumlah kolom Matriks " + nama + ": ");
        int kolom = in.nextInt();

        double[][] m = new double[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                m[i][j] = in.nextDouble();
            }
        }
        return m;
    }

    public static boolean cekMatriksSiap(double[][] a, double[][] b) {
        if (a == null || b == null) {
            System.out.println("Masukkan Matriks A dan Matriks B terlebih dahulu!");
            return false;
        }
        return true;
    }

    public static double[][] tambahMatriks(double[][] a, double[][] b) {
        int baris = Math.min(a.length, b.length);
        int kolom = Math.min(a[0].length, b[0].length);
        double[][] hasil = new double[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }

    public static double[][] kurangMatriks(double[][] a, double[][] b) {
        int baris = Math.min(a.length, b.length);
        int kolom = Math.min(a[0].length, b[0].length);
        double[][] hasil = new double[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }

    public static double[][] kaliMatriks(double[][] a, double[][] b) {
        int barisA = a.length;
        int kolomA = a[0].length;
        int barisB = b.length;
        int kolomB = b[0].length;

        if (kolomA != barisB) {
            System.out.println("Ukuran matriks tidak kompatibel untuk perkalian (kolom A harus sama dengan baris B).");
            return null;
        }

        double[][] hasil = new double[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                double sum = 0;
                for (int k = 0; k < kolomA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                hasil[i][j] = sum;
            }
        }
        return hasil;
    }

    public static void cetakMatriks(double[][] m) {
        System.out.println("Hasil:");
        for (int i = 0; i < m.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + (j < m[i].length - 1 ? ", " : ""));
            }
            System.out.println(" ]");
        }
    }
}