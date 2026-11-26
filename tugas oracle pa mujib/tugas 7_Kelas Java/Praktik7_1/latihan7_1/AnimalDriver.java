package latihan7_1;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(120, 6, 15);

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed());
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed());
    }
}