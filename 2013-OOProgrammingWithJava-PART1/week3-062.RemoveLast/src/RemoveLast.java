import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    // Remove last item from list
    // Note: in Java, for primitives (int, double, char etc.) a copy of the
    // *value* is passed to a method, and thus only this copy is changed within
    // the method. In order to get the mutated primitive back, you have to
    // return it. However, for arrays and objects, a copy of the *reference*
    // is passed, and as such, permutations within the method change the
    // original array or object. The array reference doesn't need to be returned.
    
    public static void removeLast(ArrayList<String> list) {
        int lastItem = list.size() - 1;
        list.remove(lastItem);
    }

    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        // sort the persons
        Collections.sort(persons);

        // and remove the last
        removeLast(persons);

        System.out.println(persons);
    }
}