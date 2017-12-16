
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        // Sum of all integers between lowerLim and UpperLim
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int lowerLim = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperLim = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        while (lowerLim <= upperLim) {
            sum += lowerLim;
            lowerLim ++;
        }
        System.out.println("The sum is " + sum);
    }
}
