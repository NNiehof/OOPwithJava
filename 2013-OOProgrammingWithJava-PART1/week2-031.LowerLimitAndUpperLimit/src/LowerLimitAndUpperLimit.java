
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        // Print numbers between first and last given number
        
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int lastNum = Integer.parseInt(reader.nextLine());
        
        while (firstNum <= lastNum) {
            System.out.println(firstNum);
            firstNum ++;
        }

    }
}
