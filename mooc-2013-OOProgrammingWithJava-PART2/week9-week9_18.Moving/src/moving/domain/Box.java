package moving.domain;

import java.util.ArrayList;

/**
 * Box.java
 *
 * @author NNiehof
 */

public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> thingsInBox;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.thingsInBox = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if ((this.getVolume() + thing.getVolume()) <= this.maximumCapacity) {
            this.thingsInBox.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "things in the box: " + this.getVolume() + " dm^3";
    }
    
    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : this.thingsInBox) {
            volume += thing.getVolume();
        }
        return volume;
    }
}
