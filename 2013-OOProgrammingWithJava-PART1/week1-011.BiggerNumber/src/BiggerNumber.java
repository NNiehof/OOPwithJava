
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        // Ask user for two integers, print the larger of the two.
        
        Scanner reader = new Scanner(System.in);

        // user input
        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        int largerNum = Math.max(firstNum, secondNum);
        System.out.println("The bigger number given was: " + largerNum);
    }
}
