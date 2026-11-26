package latihan4_4;

public class UjiString {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("a. compareTo(s1, s2): " + s1.compareTo(s2));
        System.out.println("b. s2.equals(s3): " + s2.equals(s3));
        System.out.println("c. s3 == s1: " + (s3 == s1));
        System.out.println("d. s2.compareTo(s3): " + s2.compareTo(s3));
        System.out.println("e. s3.equals(s1): " + s3.equals(s1));
    }
}