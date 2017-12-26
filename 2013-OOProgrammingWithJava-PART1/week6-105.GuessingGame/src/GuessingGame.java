
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        while (true) {
            // Is the value greater than the middle of the current search range?
            // Adapt the search range depending on the answer.
            int middleValue = average(lowerLimit, upperLimit);
            System.out.println(lowerLimit + ", " + middleValue + ", " + upperLimit);

            boolean greater = isGreaterThan(middleValue);
            if (greater) {
                lowerLimit = middleValue + 1;
            } else {
                upperLimit = middleValue;
            }

            // When lowerLimit and upperLimit are the same, give the answer
            if (lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is " + upperLimit);
                break;
            }
        }
    }

    public boolean isGreaterThan(int value) {
        while (true) {
            System.out.println("Is your number greater than " + value + "? (y/n)");
            String reply = this.reader.nextLine();
            if (reply.equals("y")) {
                return true;
            } else if (reply.equals("n")) {
                return false;
            } else {
                System.out.println("Answer only y or n");
            }
        }
    }

    public int average(int firstNumber, int secondNumber) {
        // Average of two integers, rounded down to nearest integer
        return (firstNumber + secondNumber) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        // Number of times the number can be halved is log_2(number).
        // Log base conversion: log_2(x) = log_10(x) / log_10(2)
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
