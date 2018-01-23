package boxes;

import java.util.ArrayList;


/**
 * OneThingBox.java
 *
 * @author NNiehof
 */

public class OneThingBox extends Box {

    private ArrayList<Thing> things;
    
    public OneThingBox() {
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        if (this.things.isEmpty()) {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }

}
