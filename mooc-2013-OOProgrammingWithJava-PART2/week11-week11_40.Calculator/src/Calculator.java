
/**
 * Calculator.java
 *
 * @author NNiehof
 */

public class Calculator {
    
    private int result;
    
    public Calculator(){
        this.result = 0;
    }
    
    public void add(int number) {
        this.result += number;
    }
    
    public void subtract(int number) {
        this.result -= number;
    }
    
    public String getResult() {
        return Integer.toString(this.result);
    }
    
    public void reset() {
        this.result = 0;
    }

}
