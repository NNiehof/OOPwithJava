
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        // Ask the user for a number, tell whether it is odd or even.

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        // test whether number is even or odd
        if ((num % 2) == 0) {
            System.out.println("Number " + num + " is even.");
        } else {
            System.out.println("Number " + num + " is odd.");
        }

    }
}
