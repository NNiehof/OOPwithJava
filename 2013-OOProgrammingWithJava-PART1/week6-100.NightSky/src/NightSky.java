
/**
 *
 * @author NNiehof
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public void printLine() {
        Random starOrWhitespace = new Random();

        for (int index = 0; index < this.width; index++) {
            double star = starOrWhitespace.nextDouble();
            if (star < this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int index = 0; index < this.height; index++) {
            printLine();
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
