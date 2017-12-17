import java.util.Scanner;

public class TheEndPart {
    // Print end part of a word.
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int endLength = Integer.parseInt(reader.nextLine());
        int startIndex = word.length() - endLength;
        
        System.out.println("Result: " + word.substring(startIndex));
    }
}
