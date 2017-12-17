
import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        // First character of user's name
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char firstChar = firstCharacter(name);
        System.out.println("First character: " + firstChar);
    }

    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
