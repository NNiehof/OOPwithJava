
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    // Ask for words input until empty string is given, then give words back
    // in reverse order.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String entry = reader.nextLine();

            if (entry.isEmpty()) {
                Collections.reverse(words); // reverse order in place
                System.out.println("You typed the following words: ");
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }
            words.add(entry);
        }
    }
}
