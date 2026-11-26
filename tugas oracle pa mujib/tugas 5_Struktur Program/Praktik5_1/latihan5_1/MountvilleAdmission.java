package latihan5_1;

import java.util.Scanner;

public class MountvilleAdmission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Apakah Anda valedictorian atau salutatorian? (true/false): ");
        boolean isTopRank = in.nextBoolean();

        System.out.print("Masukkan jumlah siswa di sekolah: ");
        int jumlahSiswa = in.nextInt();

        System.out.print("Masukkan GPA Anda: ");
        double gpa = in.nextDouble();

        System.out.print("Masukkan skor SAT Anda: ");
        int sat = in.nextInt();

        boolean diterima = (isTopRank && jumlahSiswa >= 1400)
                || (gpa >= 4.0 && sat >= 1100)
                || (gpa >= 3.5 && sat >= 1300)
                || (gpa >= 3.0 && sat >= 1500);

        if (diterima) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi syarat penerimaan Mountville University.");
        }

        in.close();
    }
}