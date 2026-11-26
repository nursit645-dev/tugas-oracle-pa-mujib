package latihan7_2;

public class FishDriver {
    public static void main(String[] args) {
        // Soal 6: Inisialisasi 2 ikan baru
        Fish ikan1 = new Fish("Amber", "AngelFish", 5);
        Fish ikan2 = new Fish("James", "Guppy", 3);

        System.out.println("Ikan 1: " + ikan1.infoIkan());
        System.out.println("Ikan 2: " + ikan2.infoIkan());

        // Soal 7 & 9: Uji nicestFish dengan 2 ikan
        Fish palingRamahDua = Fish.nicestFish(ikan1, ikan2);
        System.out.println("\nHasil nicestFish(ikan1, ikan2): " + palingRamahDua.infoIkan());

        // Soal 8 & 9: Uji nicestFish varargs dengan jumlah ikan bervariasi
        Fish ikan3 = new Fish("Bubu", "Betta", 1);
        Fish palingRamahVarargs = Fish.nicestFish(ikan1, ikan2, ikan3);
        System.out.println("Hasil nicestFish varargs: " + palingRamahVarargs.infoIkan());
    }
}