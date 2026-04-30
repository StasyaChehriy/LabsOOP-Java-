package LAB_4.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Main executive class for Laboratory Work #4.
 */
public class MainLab4 {
    public static void main(String[] args) {
        String input = "Hello,   world! This\ttext is a   test.";

        // 1. Create Text object (logic handles cleaning tabs/spaces)
        Text text = new Text(input);

        // 2. Collect all Word objects from the hierarchy
        List<Word> allWords = new ArrayList<>();
        for (Sentence sentence : text.getSentences()) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    allWords.add((Word) element);
                }
            }
        }

        // 3. Sorting logic (Variant 8/5123: Sort by vowel count)
        allWords.sort(Comparator.comparingInt(MainLab4::countVowels));

        System.out.println("--- Results (Sorted by Vowels) ---");
        for (Word word : allWords) {
            System.out.println(word + " -> " + countVowels(word) + " vowels");
        }
    }

    /**
     * Helper method to count vowels in a Word object.
     */
    private static int countVowels(Word word) {
        String vowels = "aeiouyAEIOUYаеєиіїоуюяАЕЄИІЇОУЮЯ";
        int count = 0;
        for (char c : word.getStringValue().toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }
}
