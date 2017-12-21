import java.util.Random;

public class PasswordRandomizer {
    private String password;
    private int passwordLength;
    private final String symbol = "abcdefghijklmnopqrstuvwxyz";
    private Random random;

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        this.random = new Random();
    }

    public String createPassword() {
        // create passward from random
        this.password = "";
        for (int letter = 0; letter < this.passwordLength; letter++) {
            this.password += symbol.charAt(this.random.nextInt(26));
        }
        return this.password;
    }
}
