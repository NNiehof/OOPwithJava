
import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    // Ask user to input words until empty string is given, then print list of words.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String entry = reader.nextLine();

            if (!(entry.isEmpty())) {
                words.add(entry);
            } else {
                System.out.println("You typed the following words:");
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }
        }
    }
}
