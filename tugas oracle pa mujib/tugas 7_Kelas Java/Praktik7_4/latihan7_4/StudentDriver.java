package latihan7_4;

import java.util.Date;

public class StudentDriver {
    public static void main(String[] args) {
        Student mhs = new Student("Rifky", "", "Suhandi", new Date(),
                "2411001", "PPLG", "Sarjana", 2028);

        String[] nilaiSemester = {"A", "A-", "B+", "B"};
        mhs.calculateGpa(nilaiSemester);

        System.out.println("Nama Lengkap: " + mhs.getName());
        System.out.printf("NIM: %s | Jurusan: %s | Gelar: %s | Lulus: %d%n",
                mhs.getNim(), mhs.getMajor(), mhs.getDegree(), mhs.getExpectedGraduationYear());
        System.out.printf("IP Baru: %.2f%n", mhs.getGpa());

        mhs.changeMajor("Rekayasa Perangkat Lunak");
        System.out.println("Jurusan setelah diubah: " + mhs.getMajor());
    }
}