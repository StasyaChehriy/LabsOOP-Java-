package LAB_4.src;

/**
 * Represents a word consisting of an array of Letter objects.
 */
public class Word {
    private final Letter[] letters;

    /**
     * @param wordStr String to be converted into an array of Letters.
     */
    public Word(String wordStr) {
        this.letters = new Letter[wordStr.length()];
        for (int i = 0; i < wordStr.length(); i++) {
            this.letters[i] = new Letter(wordStr.charAt(i));
        }
    }

    /**
     * @return String representation of the word.
     */
    public String getStringValue() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) {
            sb.append(l.getValue());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getStringValue();
    }
}
