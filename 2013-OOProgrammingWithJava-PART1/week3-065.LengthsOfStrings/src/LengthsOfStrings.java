
import java.util.ArrayList;

public class LengthsOfStrings {
    // From a list of strings, get the length of each string, and return an
    // array of these lengths.

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        for (String word : list) {
            int wordLen = word.length();
            lengthList.add(wordLen);
        }
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
