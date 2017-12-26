
/**
 *
 * @author NNiehof
 */

import java.util.ArrayList;

public class BirdWatching {
    private ArrayList<Bird> birdObservations;
    
    public BirdWatching() {
        this.birdObservations = new ArrayList<Bird>();
    }
    
    public void add(Bird bird) {
        this.birdObservations.add(bird);
    }
    
    public void observation(Bird bird) {
        bird.addObservation();
    }
    
    public void statistics() {
        for (Bird bird : birdObservations) {
            bird.show();
        }
    }
    
    public ArrayList<Bird> birdList() {
        return this.birdObservations;
    }
}
