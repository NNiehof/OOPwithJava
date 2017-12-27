
import java.util.Scanner;

/**
 * TextUserInterface.java
 *
 * @author NNiehof
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Statement: ");
            String input = this.reader.nextLine();
            
            if (input.equals("quit")) {
                break;
                
            } else if (input.equals("add")) {
                // Ask for a Finnish word and its English translation, then
                // add to dictionary
                System.out.println("In Finnish: ");
                String word = this.reader.nextLine();
                System.out.println("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(word, translation);
                
            } else if (input.equals("translate")) {
                // Ask for Finnish word, print English translation
                System.out.println("Give a word: ");
                String word = this.reader.nextLine();
                String translation = this.dictionary.translate(word);
                System.out.println("Translation: " + translation);
                
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}
