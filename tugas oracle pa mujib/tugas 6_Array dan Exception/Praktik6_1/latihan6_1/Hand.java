package latihan6_1;

public class Hand {
    private Card[] cards = new Card[5];
    private int count = 0;

    public boolean addCard(Card c) {
        if (c != null && count < cards.length) {
            cards[count] = c;
            count++;
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }

    public int getPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        // Jika total > 21 dan ada Ace bernilai 11, kurangi 10 poin per Ace hingga <= 21
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void printHand(String label) {
        System.out.println("=== " + label + " ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + cards[i]);
        }
        System.out.println("Total poin: " + getPoints());
    }
}