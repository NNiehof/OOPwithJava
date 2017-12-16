
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        // Calculates the sum of all positive integers up to and including n
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Upper limit: ");
        int upperLim = Integer.parseInt(reader.nextLine());
        int num = 1;
        int sum = 0;
        
        while (num <= upperLim) {
            sum += num;
            num ++;
        }
        System.out.println("Sum is " + sum);
    }
}
