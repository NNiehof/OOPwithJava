import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    // Add a number from list 'second' to list 'first' only if the number does
    // not exist in  'first' yet.
    
    public static void smartCombine(ArrayList<Integer> list1,
            ArrayList<Integer> list2) {
        for (int item : list2) {
            if (!list1.contains(item)) {
                list1.add(item);
            }
        }
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
