package boxes;

import java.util.ArrayList;


/**
 * MaxWeightBox.java
 *
 * @author NNiehof
 */

public class MaxWeightBox extends Box {

    private int maxWeight;
    private ArrayList<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        if ((this.getWeight() + thing.getWeight()) <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
    
    public int getWeight() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        return weight;
    }

}
