package latihan6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deck d = new Deck();

        System.out.println("Mengocok deck kartu...");
        d.shuffle();
        System.out.println("Kartu teratas setelah diacak: " + d.cardArray[0]);

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        // Bagikan 2 kartu awal ke pemain dan dealer
        playerHand.addCard(d.dealCard());
        playerHand.addCard(d.dealCard());
        dealerHand.addCard(d.dealCard());
        dealerHand.addCard(d.dealCard());

        playerHand.printHand("Kartu Pemain");

        // Pemain boleh menambah kartu hingga maksimal 5 kartu atau poin > 21
        while (playerHand.getCount() < 5 && playerHand.getPoints() <= 21) {
            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("y")) {
                playerHand.addCard(d.dealCard());
                playerHand.printHand("Kartu Pemain");
            } else {
                break;
            }
        }

        int playerPoints = playerHand.getPoints();
        if (playerPoints > 21) {
            System.out.println("Poin Anda melebihi 21 (Bust)! Dealer menang.");
        } else {
            // Giliran dealer: berhenti jika poin >= 16 atau kartu mencapai 5
            while (dealerHand.getPoints() < 16 && dealerHand.getCount() < 5) {
                dealerHand.addCard(d.dealCard());
            }

            dealerHand.printHand("Kartu Dealer");
            int dealerPoints = dealerHand.getPoints();

            if (dealerPoints > 21 || playerPoints > dealerPoints) {
                System.out.println("Selamat! Anda mengalahkan Dealer.");
            } else if (playerPoints < dealerPoints) {
                System.out.println("Dealer menang.");
            } else {
                System.out.println("Hasil seri (Push)!");
            }
        }

        in.close();
    }
}