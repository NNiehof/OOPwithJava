
/**
 *
 * @author NNiehof
 */

public class BoundedCounter {
    // Counter class for building a simple clock

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // increment counter, wrap around to 0 when it exceeds upperLimit
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            // print initial zero if value is under 10
            return "0" + this.value;
        } else {
            // prefix with empty string, otherwise int can't be transformed into string
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (!(value < 0) && !(value > upperLimit)) {
            this.value = value;
        }
    }
}
