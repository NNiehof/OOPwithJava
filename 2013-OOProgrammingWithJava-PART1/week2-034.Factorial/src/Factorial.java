
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Calculate factorial

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int upperLim = Integer.parseInt(reader.nextLine());
        int num = 1;
        int fact = num;
        
        while (num <= upperLim) {
            fact *= num;
            num ++;
        }
        System.out.println("Factorial is " + fact);
    }
}
