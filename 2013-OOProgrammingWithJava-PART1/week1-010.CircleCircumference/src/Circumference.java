
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        // Ask user for a radius, calculate the circumference.
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumferene of the circle: " + circumference);
    }
}
