
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Printer.java
 *
 * @author NNiehof
 */

public class Printer {

    private File file;
    
    public Printer(String filename) throws Exception {
        this.file = new File(filename);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException {
        // Note: must make new Scanner object every time, because Scanner reads
        // through the file only once.
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            String wordsFromFile = reader.nextLine();
            if (wordsFromFile.contains(word) || word.isEmpty()) {
                System.out.println(wordsFromFile);
            }
        }
    }
}
