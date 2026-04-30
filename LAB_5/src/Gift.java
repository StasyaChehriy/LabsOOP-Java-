package LAB_5.src;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents a children's gift containing various sweets.
 */
public class Gift {
    private final Sweet[] sweets;

    public Gift(Sweet[] sweets) {
        if (sweets == null || sweets.length == 0) {
            throw new IllegalStateException("Gift cannot be empty");
        }
        this.sweets = sweets;
    }

    public double calculateTotalWeight() {
        double total = 0;
        for (Sweet s : sweets) total += s.getWeight();
        return total;
    }

    public void sortByWeight() {
        Arrays.sort(sweets, Comparator.comparingDouble(Sweet::getWeight));
    }

    public Sweet findCandyByChocolateRange(double min, double max) {
        for (Sweet s : sweets) {
            if (s.getChocolatePercentage() >= min && s.getChocolatePercentage() <= max) {
                return s;
            }
        }
        return null;
    }

    public void printGift() {
        for (Sweet s : sweets) System.out.println(s);
    }
}
