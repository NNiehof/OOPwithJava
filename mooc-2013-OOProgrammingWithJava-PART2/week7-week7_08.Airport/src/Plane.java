
/**
 * Plane.java
 *
 * @author NNiehof
 */

public class Plane {
    private String identifier;
    private int capacity;
    
    public Plane(String name, int capacity) {
        this.identifier = name;
        this.capacity = capacity;
    }
    
    @Override
    public String toString() {
        return this.identifier + " (" + this.capacity + " ppl)";
    }
}
