package latihan7_1;

public class StudentDriver {
    public static void main(String[] args) {
        // Soal 5: Membuat tiga instance Student
        Student mhs1 = new Student("Mary Jones", 14, 46);
        Student mhs2 = new Student("John Stiner", 60, 173);
        Student mhs3 = new Student("Ari Samala", 31, 69);

        mhs1.tampilkanInfo("");
        mhs2.tampilkanInfo("");
        mhs3.tampilkanInfo("(Awal)");

        // Soal 6: Menambahkan 13 kredit dan 52 poin mutu ke Ari Samala
        mhs3.tambahKreditDanPoin(13, 52);
        mhs3.tampilkanInfo("(Setelah Update)");
    }
}