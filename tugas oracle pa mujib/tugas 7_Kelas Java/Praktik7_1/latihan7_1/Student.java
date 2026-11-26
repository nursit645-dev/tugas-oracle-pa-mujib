package latihan7_1;

public class Student {
    private String nama;
    private int kredit;
    private double gpa;
    private double poinMutu;

    public Student(String nama, int kredit, double poinMutu) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinMutu = poinMutu;
        this.gpa = hitungGpa();
    }

    // Method a: mengembalikan nilai rata-rata indeks prestasi saat ini
    public double hitungGpa() {
        if (kredit == 0) {
            return 0.0;
        }
        return poinMutu / kredit;
    }

    // Method b: memperbarui kredit, poin mutu, dan IP
    public void tambahKreditDanPoin(int tambahKredit, double tambahPoinMutu) {
        this.kredit += tambahKredit;
        this.poinMutu += tambahPoinMutu;
        this.gpa = hitungGpa();
    }

    public void tampilkanInfo(String keterangan) {
        System.out.printf("%s %s | Kredit: %d | Poin Mutu: %.0f | IP: %.2f%n",
                nama, keterangan, kredit, poinMutu, gpa);
    }
}