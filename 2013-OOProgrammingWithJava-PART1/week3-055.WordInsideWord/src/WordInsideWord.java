
import java.util.Scanner;

public class WordInsideWord {
    // Search a word for the presence of a second word.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type first word: ");
        String firstWord = reader.nextLine();
        System.out.println("Type second word: ");
        String secondWord = reader.nextLine();
        
        int isSubstring = firstWord.indexOf(secondWord);
        if (isSubstring != -1) {
            System.out.println("The word '" + secondWord
                    + "' is found in the word '" + firstWord + "'.");
        } else {
            System.out.println("The word '" + secondWord
                    + "' is not found in the word '" + firstWord + "'.");
        }
    }
}
