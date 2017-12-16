
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        // Super secure checking of usernames and passwords
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        if ((username.equals("alex") && password.equals("mightyducks"))
                || (username.equals("emily") && password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
