
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        // Asks for temperature (floating point) and adds it to a graph if the
        // temperature is between -30 and 40.

        Scanner reader = new Scanner(System.in);
        double temp = 0.0;

        while (true) {
            System.out.print("Type a temperature: ");
            temp = Double.parseDouble(reader.nextLine());
            if (temp >= -30 && temp <= 40) {
                Graph.addNumber(temp);
            }
        }
    }
}
