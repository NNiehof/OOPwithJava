
/**
 * Flight.java
 *
 * @author NNiehof
 */

public class Flight {
    private Plane plane;
    private String departureAirport;
    private String destinationAirport;
    
    public Flight(Plane plane, String departureAirport,
            String destinationAirport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }
    
    @Override
    public String toString() {
        return this.plane + " (" + this.departureAirport + "-"
                + this.destinationAirport + ")";
    }
}
