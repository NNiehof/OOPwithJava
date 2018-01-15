import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RingingCentre.java
 * Author: nniehof
 */

public class RingingCentre {

    private Map<Bird, List<String>> observationPlaces;

    public RingingCentre() {
        this.observationPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        // If this bird has not been observed yet, create a list for it
        if (!this.observationPlaces.containsKey(bird)) {
            this.observationPlaces.put(bird, new ArrayList<String>());
        }

        // Add the place of the observation
        this.observationPlaces.get(bird).add(place);
    }

    public void observations(Bird bird) {

        List<String> places = this.observationPlaces.get(bird);

        int numberOfObservations = 0;
        if (places != null) {
            numberOfObservations = places.size();
        }
        System.out.println(bird + " observations: " + numberOfObservations);
        if (numberOfObservations == 0) {
            return;
        }
        for (String place : places) {
            System.out.println(place);
        }
    }
}
