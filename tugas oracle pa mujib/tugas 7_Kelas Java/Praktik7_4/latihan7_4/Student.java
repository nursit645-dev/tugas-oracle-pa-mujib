package latihan7_4;

import java.util.Date;

public class Student extends Person {
    private String nim;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String nim, String major, String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.nim = nim;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    public String getNim() {
        return nim;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    // Method untuk administrator mengubah jurusan mahasiswa
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    // Method menghitung IP dari array nilai huruf
    public double calculateGpa(String[] grades) {
        if (grades == null || grades.length == 0) {
            this.gpa = 0.0;
            return this.gpa;
        }

        double totalPoints = 0.0;
        for (String grade : grades) {
            switch (grade.toUpperCase()) {
                case "A":
                    totalPoints += 4.0;
                    break;
                case "A-":
                    totalPoints += 3.67;
                    break;
                case "B+":
                    totalPoints += 3.33;
                    break;
                case "B":
                    totalPoints += 3.0;
                    break;
                case "B-":
                    totalPoints += 2.67;
                    break;
                case "C+":
                    totalPoints += 2.33;
                    break;
                case "C":
                    totalPoints += 2.0;
                    break;
                case "D":
                    totalPoints += 1.0;
                    break;
                case "F":
                default:
                    totalPoints += 0.0;
                    break;
            }
        }

        this.gpa = totalPoints / grades.length;
        return this.gpa;
    }
}