package latihan6_1;

import java.util.Random;

public class Deck {
    Card[] cardArray = new Card[52];
    private int currentIndex = 0;

    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;

        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = cardArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
        currentIndex = 0;
    }

    public Card dealCard() {
        if (currentIndex < cardArray.length) {
            return cardArray[currentIndex++];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}