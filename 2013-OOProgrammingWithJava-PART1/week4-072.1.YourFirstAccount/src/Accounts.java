
import java.util.Scanner;

public class Accounts {
    // Create an account with the provided Account class.

    public static void main(String[] args) {
        Account NynkesAccount = new Account("Nynke's account", 100.0);
        NynkesAccount.deposit(20.0);
        System.out.println(NynkesAccount);
    }

}
