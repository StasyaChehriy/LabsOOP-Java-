package LAB_4.test;

import LAB_4.src.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Laboratory Work #4.
 * Verifies object hierarchy and text cleaning logic.
 */
class TextProcessorTest {

    @Test
    void testTextCleaning() {
        // Requirement: Replace tabs and multiple spaces with a single space
        String input = "Word1\t\tWord2    Word3";
        Text text = new Text(input);

        // After cleaning, it should be "Word1 Word2 Word3"
        // We check the first sentence components
        Sentence sentence = text.getSentences()[0];
        assertEquals(3, countWords(sentence), "Should contain 3 words after cleaning spaces/tabs");
    }

    @Test
    void testObjectHierarchy() {
        String input = "Hello, world!";
        Text text = new Text(input);
        Sentence sentence = text.getSentences()[0];

        // Check if the first element is a Word and the second is Punctuation
        assertTrue(sentence.getElements()[0] instanceof Word, "First element must be a Word object");
        assertTrue(sentence.getElements()[1] instanceof Punctuation, "Second element must be Punctuation");

        Word firstWord = (Word) sentence.getElements()[0];
        assertEquals("Hello", firstWord.getStringValue());
    }

    @Test
    void testLetterExtraction() {
        Word word = new Word("Java");
        // Internal check: does it correctly identify the characters?
        assertEquals("Java", word.toString());
        // Since Word is made of Letter objects, verify characters
        assertEquals('J', word.getStringValue().charAt(0));
    }

    /**
     * Helper method to count Word objects in a sentence for testing.
     */
    private int countWords(Sentence s) {
        int count = 0;
        for (Object el : s.getElements()) {
            if (el instanceof Word) count++;
        }
        return count;
    }
}
