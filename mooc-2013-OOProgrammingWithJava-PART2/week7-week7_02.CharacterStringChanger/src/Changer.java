import java.util.ArrayList;

/**
 * Changer.java
 *
 * @author NNiehof
 */

public class Changer {
    private ArrayList<Change> changeList;
    
    public Changer() {
        this.changeList = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.changeList.add(change);
    }
    
    public String change(String characterString) {
        // Executes all added Changes for the character string in the order of
        // their adding and returns the changed character string.
        for (Change toChange : this.changeList) {
            characterString = toChange.change(characterString);
        }
        return characterString;
    }
}
