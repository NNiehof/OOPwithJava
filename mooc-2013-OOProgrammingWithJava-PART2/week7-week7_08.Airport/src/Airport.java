
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Airport.java Airport class with two user interfaces: Interface Airport panel
 * allows user to add Plane or Flight objects. Exiting prompts the second
 * interface. Interface Flight service allows the user to view plane or flight
 * information.
 *
 * @author NNiehof
 */
public class Airport {

    private Scanner reader;
    private HashMap<String, Plane> planes;
    private HashMap<String, ArrayList<Flight>> flights;

    public Airport(Scanner reader) {
        this.reader = reader;
        this.planes = new HashMap<String, Plane>();
        this.flights = new HashMap<String, ArrayList<Flight>>();
    }

    public void start() {
        airportUI();
        flightUI();
    }

    // User interfaces
    public void airportUI() {
        // Display Airport panel menu and ask user to pick a menu item
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");

            String choice = this.reader.nextLine();

            // Connect user menu choice to the corresponding action
            if (choice.contains("1")) {
                addAirplane();
            } else if (choice.contains("2")) {
                addFlight();
            } else if (choice.contains("x")) {
                break;
            }
        }
    }

    public void flightUI() {
        // Display Flight service menu and ask user to pick a menu item
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String choice = this.reader.nextLine();

            // Connect user menu choice to the corresponding action
            if (choice.contains("1")) {
                printAllPlanes();
            } else if (choice.contains("2")) {
                printAllFlights();
            } else if (choice.contains("3")) {
                printPlane();
            } else if (choice.contains("x")) {
                break;
            }
        }
    }

    // Menu actions
    public void addAirplane() {
        // Create new Plane object with user specifications, add to planes hashmap
        System.out.println("Give plane ID:");
        String planeId = this.reader.nextLine();
        System.out.println("Give plane capacity:");
        int capacity = Integer.parseInt(reader.nextLine());

        Plane plane = new Plane(planeId, capacity);
        this.planes.put(planeId, plane);
    }

    public void addFlight() {
        // Create new Flight object with user specifications, add to flights hashmap
        System.out.println("Give plane ID:");
        String planeId = this.reader.nextLine();
        System.out.println("Give departure airport code:");
        String departureAirport = this.reader.nextLine();
        System.out.println("Give destination airport code:");
        String destinationAirport = this.reader.nextLine();

        // Only add Flight if the Plane instance already exists
        Plane plane = this.planes.get(planeId);
        if (plane != null) {
            Flight flight = new Flight(plane, departureAirport, destinationAirport);

            // If a flight with the key planeId doesn't exist yet, create it,
            // and put an ArrayList as the value
            if (!this.flights.containsKey(planeId)) {
                ArrayList<Flight> flightList = new ArrayList<Flight>();
                flightList.add(flight);
                this.flights.put(planeId, flightList);
            } // If a flight with key planeId already exists, get the ArrayList,
            // add the new flight, and overwrite the old value with the
            // updated ArrayList
            else {
                ArrayList<Flight> flightList = this.flights.get(planeId);
                flightList.add(flight);
                this.flights.put(planeId, flightList);
            }
        } else {
            System.out.println(planeId + " is not a valid plane ID");
        }
    }

    public void printAllPlanes() {
        for (String key : this.planes.keySet()) {
            Plane plane = this.planes.get(key);
            System.out.println(plane);
        }
    }

    public void printAllFlights() {
        for (String key : this.flights.keySet()) {
            // A plane can go on multiple flights, therefore we must iterate
            // through an ArrayList of flights to print them all
            ArrayList<Flight> flightList = this.flights.get(key);
            for (Flight flight : flightList) {
                System.out.println(flight);
            }
        }
    }

    public void printPlane() {
        System.out.println("Give plane ID:");
        String planeId = reader.nextLine();

        if (this.planes.containsKey(planeId)) {
            Plane plane = this.planes.get(planeId);
            System.out.println(plane);
        }
    }
}
