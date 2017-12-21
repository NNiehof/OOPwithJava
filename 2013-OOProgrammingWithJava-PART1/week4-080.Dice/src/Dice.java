import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public int roll() {
        // a random number belonging to range 1-numberOfSides
        int rollResult = this.random.nextInt(this.numberOfSides) + 1;
        return rollResult;
    }
}
