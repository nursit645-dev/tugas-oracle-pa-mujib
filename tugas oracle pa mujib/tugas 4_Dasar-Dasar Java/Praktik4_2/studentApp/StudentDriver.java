package studentApp;

public class StudentDriver {
    public static void main(String[] args) {
        // Membuat object dari class Student
        Student stu1 = new Student("Lisa", "Palombo", 123456789, "Active");

        // Mencetak informasi object ke layar
        stu1.displayInfo();
    }
}