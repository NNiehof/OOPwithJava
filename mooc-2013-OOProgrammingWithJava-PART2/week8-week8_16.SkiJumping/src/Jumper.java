import java.util.ArrayList;

/**
 * Jumper.java
 * Ski jumper class for individual jumpers. Overrides Comparable.compareTo
 * in order to compare ski jumpers based on points.
 *
 * @author NNiehof
 */

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private ArrayList<Integer> jumpLengths;
    
    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        this.jumpLengths = new ArrayList<Integer>();
    }
    
    @Override
    public int compareTo(Jumper otherJumper) {
        return this.points - otherJumper.getPoints();
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void setPoints(int newPoints) {
        this.points = newPoints;
    }
    
    public void addJump(int jumpLength) {
        this.jumpLengths.add(jumpLength);
    }
    
    public int getJump(int jumpNumber) {
        // return jump distance with the given index jumpNumber
        return this.jumpLengths.get(jumpNumber);
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
}
