
/**
 * Calculator.java
 * A simple calculator
 *
 * @author NNiehof
 */

public class Calculator {
    private Reader reader;
    private int numberOfCalculations;
    
    public Calculator() {
        reader = new Reader();
        this.numberOfCalculations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                this.numberOfCalculations++;
                sum();
            } else if (command.equals("difference")) {
                this.numberOfCalculations++;
                difference();
            } else if (command.equals("product")) {
                this.numberOfCalculations++;
                product();
            }
        }

        statistics();
    }
    
    private void sum() {
        // Ask user for two values, return the sum
        int[] array = inputValues();        
        System.out.println("sum of the values " + (array[0] + array[1]));
    }
    
    private void difference() {
        // Ask user for two values, return the difference
        int[] array = inputValues();        
        System.out.println("difference of the values " + (array[0] - array[1]));
    }
    
    private void product() {
        // Ask user for two values, return the product
        int[] array = inputValues();        
        System.out.println("product of the values " + (array[0] * array[1]));
    }
    
    private int[] inputValues() {
        // Ask user for two inputs, return in int[] array
        int[] array = new int[2];
        System.out.println("value1: ");
        array[0] = reader.readInteger();
        System.out.println("value2: ");
        array[1] = reader.readInteger();
        return array;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.numberOfCalculations);
    }
}
