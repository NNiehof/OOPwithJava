
import java.util.ArrayList;

public class AverageOfNumbers {
    // Average of array of integers.

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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}