
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    // Ask for user to input words until the same word is given twice.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String entry = reader.nextLine();
            if (words.contains(entry)) {
                System.out.println("You gave the word " + entry + " twice");
                break;
            }
            words.add(entry);
        }
    }
}
