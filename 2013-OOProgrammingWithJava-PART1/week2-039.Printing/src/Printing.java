public class Printing {

    public static void printStars(int amount) {
        // Print `amount` number of asterisks
        int count = 0;
        while (count < amount) {
            System.out.print("*");
            count ++;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // Print asterisks in a square
        for(int line=0; line<sideSize; line++) {
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        // Print asterisks in a rectangle
        for(int line=0; line<height; line++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // Print asterisks in a triangle
        for(int line=0; line<size; line++) {
            printStars(line + 1);
        }
    }

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
