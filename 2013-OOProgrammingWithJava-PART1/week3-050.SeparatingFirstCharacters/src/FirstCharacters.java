import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        // Print first three letters of name separately, if name has at least
        // three characters.
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        if (name.length() > 2) {
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }
    }
}
