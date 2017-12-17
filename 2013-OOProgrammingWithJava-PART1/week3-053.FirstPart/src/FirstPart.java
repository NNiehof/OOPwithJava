
import java.util.Scanner;

public class FirstPart {
    // Print the first part of a word.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int endIndex = Integer.parseInt(reader.nextLine());
        
        String firstPart = word.substring(0, endIndex);
        System.out.println("Result: " + firstPart);
    }
}
