package LAB_5.test;

import LAB_5.src.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Gift and Sweet hierarchy.
 * Verifies weight calculation, sorting, and exception handling.
 */
class GiftTest {

    @Test
    void testCalculateTotalWeight() {
        Sweet[] items = {
                new ChocolateCandy("Dark", 100.0, 80.0),
                new Lollipop("Fruit", 50.0)
        };
        Gift gift = new Gift(items);

        // Expected weight: 100 + 50 = 150
        assertEquals(150.0, gift.calculateTotalWeight(), "The total weight should be the sum of all sweets.");
    }

    @Test
    void testSortingByWeight() {
        Sweet light = new Lollipop("Light", 10.0);
        Sweet heavy = new ChocolateCandy("Heavy", 200.0, 50.0);
        Gift gift = new Gift(new Sweet[]{heavy, light});

        gift.sortByWeight();

        // After sorting, the first element should be the lightest one
        assertEquals(light, gift.findCandyByChocolateRange(-1, 101), "Sorting should put the lightest candy first.");
    }

    @Test
    void testFindCandyByChocolateRange() {
        Sweet candy = new ChocolateCandy("Target", 20.0, 45.0);
        Gift gift = new Gift(new Sweet[]{
                new Lollipop("No-Chocolate", 10.0),
                candy
        });

        // Search for chocolate between 40% and 50%
        Sweet found = gift.findCandyByChocolateRange(40.0, 50.0);

        assertNotNull(found, "Should find a candy within the specified chocolate range.");
        assertEquals("Target", found.getName());
    }

    @Test
    void testInvalidWeightException() {
        // Requirement: Handle exceptions for invalid data
        assertThrows(IllegalArgumentException.class, () -> {
            new ChocolateCandy("Bad Candy", -10.0, 50.0);
        }, "Should throw IllegalArgumentException for negative weight.");
    }
}
