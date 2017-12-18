
public class DecreasingCounter {

    private int value;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // do not decrement below 0
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        // reset the counter
        this.value = 0;
    }
    
    public void setInitial() {
        // return counter to initial value
        this.value = this.initialValue;
    }
}
