import java.util.ArrayList;

public class Variance {
    // Calculate variance of a list of integers.
    
    public static int sum(ArrayList<Integer> list) {
        int summed = 0;
        for (int item : list) {
            summed += item;
        }
        return summed;
    }

    public static double average(ArrayList<Integer> list) {
        double averageVal = (double)sum(list) / list.size();
        return averageVal;
    }

    public static double variance(ArrayList<Integer> list) {
        // Sum of squared errors sse (deviation from the mean), divided by number
        // of samples.
        int number = list.size() - 1; // N samples
        double averageVal = average(list);
        double sse = 0; // sum of squared errors
        for (int item : list) {
            sse += Math.pow(((double)item - averageVal), 2.0);
        }
        double variance = sse / number;
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
