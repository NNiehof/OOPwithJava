
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        // Print all numbers up to a user-entered number
        
        Scanner reader = new Scanner(System.in);
        int num = 1;
        
        System.out.print("Up to what number? ");
        int upperLim = Integer.parseInt(reader.nextLine());
        
        while (num <= upperLim) {
            System.out.println(num);
            num ++;
        }
    }
}
