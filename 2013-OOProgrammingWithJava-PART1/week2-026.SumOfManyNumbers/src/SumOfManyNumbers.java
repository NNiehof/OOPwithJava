
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        // Sum input numbers until user inputs a zero.
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum = sum + read;
            System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}
