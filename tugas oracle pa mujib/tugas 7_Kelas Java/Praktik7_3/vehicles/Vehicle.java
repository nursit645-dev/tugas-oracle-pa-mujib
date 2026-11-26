package vehicles;

public class Vehicle {
    // Static variables (Soal 1b.iii - iv)
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables (Soal 1b.vi - vii)
    private String chassisNo;
    private String model;

    // Constructor (Soal 1b.viii - xii)
    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // Static Nested Class Engine (Soal 3 & Soal 4)
    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Constructor Soal 4b - 4c
        public Engine(String model) {
            super(model);
        }

        // Public static getters Soal 3f
        public static String getMAKE() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    // Getter dan Setter untuk instance variables (Soal 1b.xiii)
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method setMake untuk pengujian Soal 2a
    public void setMake(String make) {
        Vehicle.MAKE = make;
    }

    // Method toString() diperbarui sesuai Soal 1k & Soal 3g
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE
                + "\nThe model type is " + model
                + "\nThe chassis number is " + chassisNo
                + "\nThe engine make is " + Engine.getMAKE()
                + "\nThe engine capacity is " + Engine.getCapacity() + "cc";
    }
}