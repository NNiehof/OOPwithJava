
import java.util.Scanner;

public class SeparatingCharacters {
    // Give characters from name separately.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int nameLen = name.length();
        int count = 0;
        
        while (count < nameLen) {
            System.out.println((count + 1) + ". character: " + name.charAt(count));
            count ++;
        }
    }
}
