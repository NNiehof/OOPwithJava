import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        ArrayList<Change> changes = new ArrayList<Change>();

        changes.add(new Change('a', 'b'));
        changes.add(new Change('k', 'x'));
        changes.add(new Change('o', 'å'));

        String word = "carrot";

        for (Change Change : changes) {
            word = Change.change(word);
        }

        System.out.println(word);
    }
}
