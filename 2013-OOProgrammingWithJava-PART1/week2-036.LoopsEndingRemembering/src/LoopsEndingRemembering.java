
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        // ask for numbers until input -1 is given
        while (true) {
            System.out.println("Type numbers: ");
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                // calculate mean
                average = (double) sum / count;
                System.out.println("Average: " + average);
                // count of even and odd numbers
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
            // sum the numbers
            sum += num;
            // count the numbers
            count ++;
            // even or odd
            if (num % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
        }
    }
}
