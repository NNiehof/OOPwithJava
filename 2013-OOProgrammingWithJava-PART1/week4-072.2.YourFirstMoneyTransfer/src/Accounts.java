
public class Accounts {
    // Create accounts, transfer money from one to the other.

    public static void main(String[] args) {
        // create accounts
        Account mattsAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        
        // withdraw from Matt's account and deposit to my account
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }

}
