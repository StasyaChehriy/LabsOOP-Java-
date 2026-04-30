package LAB_4.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence consisting of Words and Punctuation marks.
 */
public class Sentence {
    private final Object[] elements;

    /**
     * Parses a sentence string into Word and Punctuation objects.
     * @param sentenceStr Raw sentence string.
     */
    public Sentence(String sentenceStr) {
        List<Object> temp = new ArrayList<>();
        // Split by whitespace keeping punctuation separate
        String[] parts = sentenceStr.split("(?=[,.!?;])|\\s+");

        for (String part : parts) {
            if (part.matches("[,.!?;]")) {
                temp.add(new Punctuation(part.charAt(0)));
            } else if (!part.isBlank()) {
                temp.add(new Word(part));
            }
        }
        this.elements = temp.toArray();
    }

    public Object[] getElements() {
        return elements;
    }
}
