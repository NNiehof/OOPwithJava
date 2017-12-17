
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        // Pick a number, ask for guesses from user, output whether the guessed
        // number is correct, greater or lesser than the picked number.
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 0;

        while (true) {
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            count ++;
            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + count);
            } else {
                System.out.println("The number is lesser, guesses made: " + count);
            }
        }
    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
