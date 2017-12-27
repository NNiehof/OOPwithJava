import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test for Airport class
        
        String input =
                "1\n" + "HA-LOL\n" + "42\n"
                + "1\n" + "G-OWAC\n" + "101\n"
                + "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n"
                + "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n"
                + "2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n"
                + "x\n"
                + "1\n"
                + "2\n"
                + "3\n" + "G-OWAC\n"
                + "x\n";
        
        // For testing locally:
//        Scanner reader = new Scanner(input);
        // For testing with TMC:
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport(reader);
        airport.start();
    }
}
