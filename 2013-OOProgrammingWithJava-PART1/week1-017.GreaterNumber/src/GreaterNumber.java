
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        // Ask user for two numbers, print the greater of the two. Also handle
        // the case where two numbers are equal.

        Scanner reader = new Scanner(System.in);

        // Get user input
        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());

        // find which number is larger or whether the numbers are equal
        if (firstNum > secondNum) {
            System.out.println("Greater number: " + firstNum);
        } else if (secondNum > firstNum) {
            System.out.println("Greater number: " + secondNum);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
