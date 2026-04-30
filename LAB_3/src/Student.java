package LAB_3.src;

import java.util.Objects;

/**
 * Represents a Student with 5 mandatory fields.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int course;
    private double gpa; // Grade Point Average

    public Student(String firstName, String lastName, int age, int course, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    public String getLastName() { return lastName; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return String.format("Student: %s %s | Course: %d | GPA: %.2f",
                lastName, firstName, course, gpa);
    }

    /**
     * Requirement: Search for an identical object.
     * Overridden to compare all fields.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }
}
