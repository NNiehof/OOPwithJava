import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        // Last character of user's name
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char lastChar = lastCharacter(name);
        System.out.println("Last character: " + lastChar);
    }

    public static char lastCharacter(String text) {
        int textLength = text.length();
        return text.charAt(textLength - 1);
    }
}
