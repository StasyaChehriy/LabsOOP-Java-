package LAB_3.test;
import LAB_3.src.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testIdenticalStudentsEquality() {

        Student s1 = new Student("Ivan", "Petrenko", 20, 2, 95.0);
        Student s2 = new Student("Ivan", "Petrenko", 20, 2, 95.0);


        assertEquals(s1, s2, "Об'єкти з однаковими даними мають бути рівними");
    }

    @Test
    void testGetters() {
        Student s = new Student("Anastasiia", "Chekhrii", 19, 2, 98.5);
        assertEquals("Chekhrii", s.getLastName());
        assertEquals(98.5, s.getGpa(), 0.01);
    }
}