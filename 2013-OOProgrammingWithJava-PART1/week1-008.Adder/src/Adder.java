
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        // Ask the user for two integers and print their sum.
        
        Scanner reader = new Scanner(System.in);

        // Get user input
        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        int sum = firstNum + secondNum;
        System.out.println("Sum of the numbers: " + sum);
    }
}
