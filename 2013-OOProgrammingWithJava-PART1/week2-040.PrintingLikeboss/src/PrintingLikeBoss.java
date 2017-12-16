
public class PrintingLikeBoss {

    public static void printStars(int amount) {
        // Print number of asterisks specified in amount.
        int count = 0;
        while (count < amount) {
            System.out.print("*");
            count++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // Print number of whitespaces specified in amount.
        int num = 0;
        while (num < amount) {
            System.out.print(" ");
            num ++;
        }
    }

    public static void printTriangle(int size) {
        // Print right-aligned triangle of size specified in amount.
        int whitespace = size;
        int stars = 0;
        while (stars < size) {
            whitespace --;
            stars ++;
            printWhitespaces(whitespace);
            printStars(stars);
            
        }
    }

    public static void xmasTree(int height) {
        // Print a christmas tree of specified height.
        
        // tree branches
        int whitespace = height - 1;
        int stars = 1;
        while (whitespace >= 0) {
            printWhitespaces(whitespace);
            printStars(stars);
            whitespace --;
            stars += 2;
        }
        // tree stem
        int stemStart = height - 2;
        printWhitespaces(stemStart);
        printStars(3);
        printWhitespaces(stemStart);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(5);
    }
}
