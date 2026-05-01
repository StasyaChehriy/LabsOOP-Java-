package LAB_6.test;

import LAB_5.src.ChocolateCandy;
import LAB_6.src.SweetSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SweetSetTest {
    @Test
    void testUniqueness() {
        SweetSet<ChocolateCandy> set = new SweetSet<>();
        ChocolateCandy c = new ChocolateCandy("Test", 10.0, 50.0);
        set.add(c);
        set.add(c); // Try to add duplicate
        assertEquals(1, set.size(), "Set must not contain duplicate elements");
    }

    @Test
    void testRemove() {
        SweetSet<ChocolateCandy> set = new SweetSet<>();
        ChocolateCandy c = new ChocolateCandy("RemoveMe", 10.0, 50.0);
        set.add(c);
        assertTrue(set.remove(c));
        assertEquals(0, set.size());
    }
}
