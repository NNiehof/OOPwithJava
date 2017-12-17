
import java.util.Scanner;

public class LengthOfName {
    // Count the number of characters in the user's name.
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int nameLength = calculateCharacters(name);
        System.out.println("Number of characters: " + nameLength);
    }
    
    public static int calculateCharacters(String text) {
        return text.length();
    }
    
}
