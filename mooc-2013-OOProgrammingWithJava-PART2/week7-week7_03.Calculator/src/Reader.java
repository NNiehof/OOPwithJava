import java.util.Scanner;

/**
 * Reader.java
 * Wrapper for Scanner object, to read String or int user input
 *
 * @author NNiehof
 */

public class Reader {
    private Scanner reader;
    
    public Reader() {
        this.reader = new Scanner(System.in);
    }
    
    public String readString() {
        return this.reader.nextLine();
    }
    
    public int readInteger() {
        return Integer.parseInt(this.reader.nextLine());
    }
}
