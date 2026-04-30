package LAB_4.src;

/**
 * Represents a single character in a word.
 */
public class Letter {
    private final char value;

    /**
     * @param value The character this object represents.
     */
    public Letter(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
