
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        // Ask the user for two integers and print their floating point quotient.
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        // floating point division
        double result = (double)firstNum / secondNum;
        System.out.println("Division: " + firstNum + " / " + secondNum
            + " = " + result);
    }
}
