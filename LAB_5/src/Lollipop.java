package LAB_5.src;

/**
 * Represents a lollipop (0% chocolate).
 */
public class Lollipop extends Sweet {
    public Lollipop(String name, double weight) {
        super(name, weight, 0); // Lollipops don't have chocolate
    }
}
