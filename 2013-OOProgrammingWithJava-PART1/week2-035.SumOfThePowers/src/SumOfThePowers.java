
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        // Sum of the powers of 2 up to n: 2^0 + 2^1 + 2^2 + ... + 2^n
        
        Scanner reader = new Scanner(System.in);

        int result = 0;
        System.out.println("Type a number: ");
        int powerN = Integer.parseInt(reader.nextLine());
        int pow = 0;
        
        while (pow <= powerN) {
            result += (int)Math.pow(2, pow);
            pow ++;
        }
        System.out.println("The result is " + result);
    }
}
