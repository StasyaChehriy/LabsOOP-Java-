package LAB_2.test;

import LAB_2.src.WordSorter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class WordSorterTest {

    @Test
    void testCountVowels() {
        assertEquals(5, WordSorter.countVowels(new StringBuffer("Education")));
        assertEquals(2, WordSorter.countVowels(new StringBuffer("Київ")));
        assertEquals(0, WordSorter.countVowels(new StringBuffer("12345")));
    }

    @Test
    void testExtractWords() {
        StringBuffer text = new StringBuffer("Hello, world! KPI");
        ArrayList<StringBuffer> words = WordSorter.extractWords(text);

        assertEquals(3, words.size());
        assertEquals("Hello", words.get(0).toString());
        assertEquals("KPI", words.get(2).toString());
    }

    @Test
    void testSortWordsByVowels() {
        ArrayList<StringBuffer> words = new ArrayList<>();
        words.add(new StringBuffer("Queue"));
        words.add(new StringBuffer("Sky"));
        words.add(new StringBuffer("Java"));

        WordSorter.sortWordsByVowels(words);

        assertEquals("Sky", words.get(0).toString());
        assertEquals("Java", words.get(1).toString());
        assertEquals("Queue", words.get(2).toString());
    }
}