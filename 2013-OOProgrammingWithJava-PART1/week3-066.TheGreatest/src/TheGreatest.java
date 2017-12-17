import java.util.ArrayList;

public class TheGreatest {
    // Return the greatest number in a list of integers.
    
    public static int greatest(ArrayList<Integer> list) {
        // Pairwise comparisons
        int maxVal = list.get(0); // initialise with first value of array
        int listLen = list.size();
        for (int index=1; index<listLen; index++) {
            maxVal = Math.max(maxVal, list.get(index));
        }
        return maxVal;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}