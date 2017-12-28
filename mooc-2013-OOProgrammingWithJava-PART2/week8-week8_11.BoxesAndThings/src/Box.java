import java.util.ArrayList;

/**
 * Box.java
 * Container for objects that implement the interface ToBeStored
 *
 * @author NNiehof
 */

public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> thingsList;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.thingsList = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing) {
        if ((weight() + thing.weight()) <= this.maxWeight) {
            this.thingsList.add(thing);
        }
    }
    
    @Override
    public double weight() {
        // total weight of all the stored things in this box
        double weight = 0;
        for (ToBeStored thing : this.thingsList) {
            weight += thing.weight();
        }
        return weight;
    }
    
    public void printAll() {
        for (ToBeStored thing : this.thingsList) {
            System.out.println(thing);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + this.thingsList.size() + " things, total weight "
                + weight() + " kg";
    }
}
