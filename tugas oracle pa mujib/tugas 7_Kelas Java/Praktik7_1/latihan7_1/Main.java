package latihan7_1;

import java.util.Scanner;

public class Main {
    public static Card buatKartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Soal 7 & 8a: Dua kartu acak awal dan total poinnya
        Card card1 = buatKartuAcak();
        Card card2 = buatKartuAcak();

        int jumlahKartu = 2;
        int totalPoin = card1.points + card2.points;

        System.out.println("Kartu 1: " + card1 + " (" + card1.points + " poin)");
        System.out.println("Kartu 2: " + card2 + " (" + card2.points + " poin)");
        System.out.println("Total poin saat ini: " + totalPoin);

        // Soal 8b & 8c: Loop tambah kartu hingga poin > 21, user berhenti, atau kartu mencapai 5
        while (totalPoin <= 21 && jumlahKartu < 5) {
            System.out.print("Apakah Anda ingin kartu lagi? (y/n): ");
            String jawab = in.next();

            if (jawab.equalsIgnoreCase("y")) {
                jumlahKartu++;
                Card kartuBaru = buatKartuAcak();
                totalPoin += kartuBaru.points;

                System.out.println("Kartu " + jumlahKartu + ": " + kartuBaru + " (" + kartuBaru.points + " poin)");
                System.out.println("Total poin untuk " + jumlahKartu + " kartu: " + totalPoin);
            } else {
                break;
            }
        }

        if (totalPoin > 21) {
            System.out.println("Total poin melebihi 21! Permainan berakhir.");
        } else {
            System.out.println("Permainan selesai. Total akhir: " + totalPoin + " poin dari " + jumlahKartu + " kartu.");
        }

        in.close();
    }
}
