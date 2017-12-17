
import java.util.Scanner;

public class ReversingText {
    // Reverse text input, this time via the reverse method.

    public static String reverse(String text) {
        int textLen = text.length();
        int count = textLen - 1;
        String textRev = ""; // put reversed text in here char for char
        
        while (count >= 0) {
            textRev = textRev + text.charAt(count);
            count --;
        }
        return textRev;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
