
import java.util.Scanner;

public class ManyPrints {
    public static void printText() {
        // A Finnish saying, originally from a book
        
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        // Prints the text as many times as specified by user
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How many? ");
        int num = Integer.parseInt(reader.nextLine());
        int count = 0;
        
        while (count < num) {
            printText();
            count ++;
        }
    }
}