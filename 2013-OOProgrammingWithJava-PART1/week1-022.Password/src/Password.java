
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        // Asks for a password until the correct passwords is given, then
        // displays a secret message.
        
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String inputPass = reader.nextLine();
            
            if (inputPass.equals(password)) {
                System.out.println("Right!");
                System.out.println("In case of fire:\ngit commit\ngit push\nEvacuate");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
