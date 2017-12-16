
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        // Ask for the user's age and check that it is within human limits (0-120).
        
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
