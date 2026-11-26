package latihan5_2;

import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pesan = "";

        for (int i = 1; i <= 10; i++) {
            String huruf = "";
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan angka ke-" + i + ": ");
                int kode = in.nextInt();

                switch (kode) {
                    case 1:
                        huruf = "D";
                        valid = true;
                        break;
                    case 2:
                        huruf = "W";
                        valid = true;
                        break;
                    case 3:
                        huruf = "E";
                        valid = true;
                        break;
                    case 4:
                        huruf = "L";
                        valid = true;
                        break;
                    case 5:
                        huruf = "H";
                        valid = true;
                        break;
                    case 6:
                        huruf = "O";
                        valid = true;
                        break;
                    case 7:
                        huruf = "R";
                        valid = true;
                        break;
                    default:
                        System.out.println("Angka belum terpecahkan. Silakan masukkan angka baru.");
                        break;
                }
            }

            pesan += huruf;
        }

        System.out.println("Pesan yang teruraikan: " + pesan);
        in.close();
    }
}