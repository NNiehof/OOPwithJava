
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A clock made up of three bounded counters

        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        // user sets the clock
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();

            // if seconds become zero, advance minutes
            int currentSeconds = seconds.getValue();
            if (currentSeconds == 0) {
                minutes.next();
                
                // if minutes become zero, advance hours
                int currentMinutes = minutes.getValue();
                if (currentMinutes == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}
