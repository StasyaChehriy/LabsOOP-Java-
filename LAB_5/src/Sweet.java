package LAB_5.src;

/**
 * Abstract base class representing a generic sweet.
 */
public abstract class Sweet {
    private final String name;
    private final double weight; // in grams
    private final double chocolatePercentage;

    public Sweet(String name, double weight, double chocolatePercentage) {
        if (weight <= 0) throw new IllegalArgumentException("Weight must be positive");
        this.name = name;
        this.weight = weight;
        this.chocolatePercentage = chocolatePercentage;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public double getChocolatePercentage() { return chocolatePercentage; }

    @Override
    public String toString() {
        return String.format("%s (Weight: %.1fg, Chocolate: %.1f%%)", name, weight, chocolatePercentage);
    }
}
