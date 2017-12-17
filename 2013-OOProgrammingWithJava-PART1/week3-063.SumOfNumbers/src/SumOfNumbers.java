import java.util.ArrayList;

public class SumOfNumbers {
    // Sum of array of integers.
    
    public static int sum(ArrayList<Integer> list) {
        int summed = 0;
        for (int item : list) {
            summed += item;
        }
        return summed;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum: " + sum(list));

        list.add(10);
        
        System.out.println("The sum: " + sum(list));
    }

}