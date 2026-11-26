package latihan7_1;

public class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String getSuit(int n) {
        switch (n) {
            case 1:
                return "Spades";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4:
                return "Clubs";
            default:
                return "Unknown";
        }
    }

    public String getName(int n) {
        switch (n) {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Unknown";
        }
    }

    public int getPoints(String cardName) {
        if (cardName.equals("Ace")) {
            return 11;
        } else if (cardName.equals("Jack") || cardName.equals("Queen") || cardName.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(cardName);
        }
    }

    @Override
    public String toString() {
        return "The " + name + " of " + suit;
    }
}
