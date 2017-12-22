import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // draw numbers, add to list if it is not yet in the list
        this.numbers = new ArrayList<Integer>();
        int num = 0;
        while (num < 7) {
            int draw = this.random.nextInt(39) + 1;
            if (!containsNumber(draw)) {
                this.numbers.add(draw);
                num++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
