package boxes;

import java.util.ArrayList;


/**
 * BlackHoleBox.java
 *
 * @author NNiehof
 */

public class BlackHoleBox extends Box {

    private ArrayList<Thing> things;
    
    public BlackHoleBox() {
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        // nothing is ever found
        return false;
    }

}
