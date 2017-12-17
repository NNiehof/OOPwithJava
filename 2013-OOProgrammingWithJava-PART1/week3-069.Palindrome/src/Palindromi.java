
import java.util.Scanner;

public class Palindromi {
    // Check whether a string is a palindrome.

    public static boolean palindrome(String text) {
        String textReverse = "";
        int lastLetter = text.length() - 1;
        for (int index = lastLetter; index >= 0; index--) {
            textReverse = textReverse + text.charAt(index);
        }
        if (text.equals(textReverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
