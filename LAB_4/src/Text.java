package LAB_4.src;

/**
 * Represents a text consisting of an array of Sentences.
 */
public class Text {
    private final Sentence[] sentences;

    /**
     * Cleans the text and splits it into sentences.
     * @param rawText Input text with possible tabs and multiple spaces.
     */
    public Text(String rawText) {
        // Requirement: Replace tabs and multiple spaces with a single space
        String cleanText = rawText.replaceAll("[\\t ]+", " ");

        String[] sentenceParts = cleanText.trim().split("(?<=[.!?])\\s*");
        this.sentences = new Sentence[sentenceParts.length];

        for (int i = 0; i < sentenceParts.length; i++) {
            this.sentences[i] = new Sentence(sentenceParts[i]);
        }
    }

    public Sentence[] getSentences() {
        return sentences;
    }
}