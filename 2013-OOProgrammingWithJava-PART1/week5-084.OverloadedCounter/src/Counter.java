
/**
 *
 * @author NNiehof
 */
public class Counter {

    private int value;
    private boolean check;

    // Multiple constructors
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        // default: check = false
        this(startingValue, false);
    }

    public Counter(boolean check) {
        // default: startingValue = 0
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    // Methods
    public int value() {
        return this.value;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            // if check is on, do not decrease below zero
            if (this.check && (this.value - decreaseAmount) < 0) {
                this.value = 0;
            }
            else {
                this.value -= decreaseAmount;
            }
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
