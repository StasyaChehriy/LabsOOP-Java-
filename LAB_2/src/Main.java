//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            String input = "Java is a class-based, object-oriented programming language.";

            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Input string cannot be empty.");
            }

            StringBuffer textBuffer = new StringBuffer(input);

            ArrayList<StringBuffer> words = WordSorter.extractWords(textBuffer);
            WordSorter.sortWordsByVowels(words);

            for (StringBuffer word : words) {
                System.out.print(word.toString() + " ");
            }

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}