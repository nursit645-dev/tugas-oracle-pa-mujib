package latihan7_2;

public class Fish {
    public String typeOfFish;
    public int friendliness;
    public String name;

    // Soal 2: Public constructor tanpa parameter
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
        name = "Unnamed";
    }

    // Soal 3: Overloaded constructor dengan parameter String t dan int f
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
        name = "Unnamed";
    }

    // Constructor tambahan untuk menyimpan nama ikan saat pengujian
    public Fish(String name, String t, int f) {
        this.name = name;
        typeOfFish = t;
        friendliness = f;
    }

    // Soal 5: Method mengembalikan tingkat keramahan ikan
    public int getFriendliness() {
        return friendliness;
    }

    // Soal 7: Method nicestFish menerima dua ikan
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() >= fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Soal 8: Overloaded nicestFish menggunakan variable arguments (varargs)
    public static Fish nicestFish(Fish... fishes) {
        if (fishes.length == 0) {
            return null;
        }

        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    public String infoIkan() {
        return name + " (" + typeOfFish + ") - Keramahan: " + friendliness;
    }
}