
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        
        while (true) {
            // ask for numbers until input -1 is given
            System.out.println("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                // stop
                System.out.println("sum: " + stats.sum());
                System.out.println("sum of even: " + statsEven.sum());
                System.out.println("sum of odd: " + statsOdd.sum());
                break;
            } else if (number % 2 == 0) {
                // even numbers
                stats.addNumber(number);
                statsEven.addNumber(number);
            } else {
                // odd numbers
                stats.addNumber(number);
                statsOdd.addNumber(number);
            }
        }
    }
}
