
import java.util.ArrayList;

/**
 * Suitcase.java Suitcase class contains Thing objects, up to a maximum weight
 * limit.
 *
 * @author NNiehof
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        // Add thing to suitcase, but only if this stays within maxWeight
        if ((totalWeight() + thing.getWeight()) <= this.maxWeight) {
            this.things.add(thing);

        }
    }

    @Override
    public String toString() {
        // Give string in proper English, also for 0 or 1 things in Suitcase
        int thingCount = countThings();
        if (thingCount == 0) {
            return "empty (" + totalWeight() + " kg)";
        } else if (thingCount == 1) {
            return thingCount + " thing (" + totalWeight() + " kg)";
        } else {
            return thingCount + " things (" + totalWeight() + " kg)";
        }
    }

    public void printThings() {
        // Print all the things in the Suitcase
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : this.things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public int countThings() {
        int count = 0;
        for (Thing thing : this.things) {
            count++;
        }
        return count;
    }

    public Thing heaviestThing() {
        // Return the heaviest thing, or null if suitcase is empty
        if (countThings() == 0) {
            return null;
        } else {
            Thing heaviestWeightObject = this.things.get(0);
            
            for (Thing thing : this.things) {
                if (thing.getWeight() > heaviestWeightObject.getWeight()) {
                    heaviestWeightObject = thing;
                }
            }
            return heaviestWeightObject;
        }
    }
}
