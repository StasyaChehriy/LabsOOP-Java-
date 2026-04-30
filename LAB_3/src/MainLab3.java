package LAB_3.src;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Execution class: sorting and searching demonstration.
 */
public class MainLab3 {
    public static void main(String[] args) {
        // Creating an array of Student objects (Requirement 3)
        Student[] students = {
                new Student("Anastasiia", "Chekhrii", 19, 2, 98.5),
                new Student("Ivan", "Petrenko", 20, 2, 95.0),
                new Student("Mariia", "Kovalenko", 18, 1, 88.0),
                new Student("Oleksandr", "Petrenko", 21, 3, 91.5)
        };

        /*
         * Sorting logic:
         * 1. Last Name - Ascending (A-Z)
         * 2. GPA - Descending (High-Low)
         */
        Arrays.sort(students, Comparator
                .comparing(Student::getLastName)
                .thenComparing(Student::getGpa, Comparator.reverseOrder()));

        System.out.println("--- Sorted Students ---");
        for (Student s : students) System.out.println(s);

        // Searching for an identical object (Requirement 3)
        Student target = new Student("Ivan", "Petrenko", 20, 2, 95.0);
        System.out.println("\nSearching for: " + target);

        for (Student s : students) {
            if (s.equals(target)) {
                System.out.println("Result: Identical student found! ✅");
                break;
            }
        }
    }
}
