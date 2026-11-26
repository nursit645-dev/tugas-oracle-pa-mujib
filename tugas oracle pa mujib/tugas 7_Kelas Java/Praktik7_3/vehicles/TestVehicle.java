package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        // Soal 1c.iii - iv: Mengakses static variable sebelum instance dibuat
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Soal 1f - 1j & 1l: Membuat vehicle1 dan vehicle2 lalu menampilkan dengan toString()
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);

        // Soal 2a - 2b: Mengubah static variable MAKE melalui vehicle2
        vehicle2.setMake("Seer");
        System.out.println("\n--- Setelah vehicle2.setMake(\"Seer\") ---");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        // Soal 4d - 4e: Membuat instance static nested class Vehicle.Engine
        System.out.println();
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("Vehicle number " + vehicle3.getChassisNo()
                + " is a " + vehicle3.getModel()
                + " model and has an engine capacity of "
                + Vehicle.Engine.getCapacity() + "cc");

        // Soal 1m: Menampilkan total jumlah mobil yang diproduksi
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}