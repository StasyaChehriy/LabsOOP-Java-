package LAB_2.src;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class WordSorter {

    public static ArrayList<StringBuffer> extractWords(StringBuffer text) {
        ArrayList<StringBuffer> words = new ArrayList<>();
        StringBuffer currentWord = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                currentWord.append(ch);
            } else {
                if (currentWord.length() > 0) {
                    words.add(new StringBuffer(currentWord));
                    currentWord.setLength(0);
                }
            }
        }
        if (currentWord.length() > 0) {
            words.add(currentWord);
        }
        return words;
    }

    public static void sortWordsByVowels(ArrayList<StringBuffer> words) {
        Collections.sort(words, new Comparator<StringBuffer>() {
            @Override
            public int compare(StringBuffer sb1, StringBuffer sb2) {
                return Integer.compare(countVowels(sb1), countVowels(sb2));
            }
        });
    }

    public static int countVowels(StringBuffer word) {
        String vowels = "aeiouyAEIOUYаеєиіїоуюяАЕЄИІЇОУЮЯ";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}