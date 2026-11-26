package latihan5_2;

import java.util.Arrays;
import java.util.Scanner;

public class CekAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan teks pertama: ");
        String str1 = in.nextLine();

        System.out.print("Masukkan teks kedua: ");
        String str2 = in.nextLine();

        // Menghapus spasi dan tanda baca lalu mengubah menjadi huruf kecil
        String bersih1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String bersih2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean adalahAnagram = false;

        if (bersih1.length() == bersih2.length()) {
            char[] arr1 = bersih1.toCharArray();
            char[] arr2 = bersih2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                adalahAnagram = true;
            }
        }

        if (adalahAnagram) {
            System.out.println("Hasil: Keduanya adalah ANAGRAM.");
        } else {
            System.out.println("Hasil: Keduanya BUKAN anagram.");
        }

        in.close();
    }
}