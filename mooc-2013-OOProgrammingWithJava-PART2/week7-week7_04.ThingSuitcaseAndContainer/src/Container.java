import java.util.ArrayList;

/**
 * Container.java
 * Container class for objects of class Suitcase. Suitcase objects can be added
 * up until the weight limit of Container.
 *
 * @author NNiehof
 */

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        // Add suitcase to container, but only if this stays within maxWeight
        if ((totalWeight() + suitcase.totalWeight()) <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public int countSuitcases() {
        int count = 0;
        for (Suitcase suitcase : this.suitcases) {
            count++;
        }
        return count;
    }
    
    @Override
    public String toString() {
        int suitcaseCount = countSuitcases();
        
        if (suitcaseCount == 0) {
            return "empty (" + totalWeight() + " kg)";
        } else if (suitcaseCount == 1) {
            return suitcaseCount + " suitcase (" + totalWeight() + " kg)";
        }
        return suitcaseCount + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printThings() {
        // Print all of the things in all of the suitcases
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
}
