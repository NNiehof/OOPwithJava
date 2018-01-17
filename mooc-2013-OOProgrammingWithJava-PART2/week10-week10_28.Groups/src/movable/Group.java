package movable;

import java.util.ArrayList;
import java.util.List;


/**
 * Group.java
 *
 * @author NNiehof
 */

public class Group implements Movable {

    private List<Movable> group;
    
    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.group) {
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String allMovableToString = "";
        for (Movable movable : this.group) {
            allMovableToString += (movable.toString() + "\n");
        }
        return allMovableToString;
    }
}
