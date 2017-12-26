
/**
 *
 * @author NNiehof
 */

public class Bird {
    private String name;
    private String latinName;
    private int observed;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    
    public String name() {
        return this.name;
    }
    
    public String latinName() {
        return this.latinName;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
    
    public void show() {
        System.out.println(this);
    }
    
    public void addObservation() {
        this.observed++;
    }
}
