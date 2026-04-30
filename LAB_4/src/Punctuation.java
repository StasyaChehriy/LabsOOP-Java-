package LAB_4.src;

/**
 * Represents a punctuation mark.
 */
public class Punctuation {
    private final char symbol;

    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
