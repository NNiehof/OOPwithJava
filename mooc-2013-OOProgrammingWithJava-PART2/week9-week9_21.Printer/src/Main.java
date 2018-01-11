
/**
 *
 * @author NNiehof
 */
public class Main {

    public static void main(String[] args) {
        Printer printer;
        try {
            printer = new Printer("src/textfile.txt");
        } catch (Exception e) {
            System.out.println("Could not open text file, Error: "
                    + e.getMessage());
            return;
        }

        try {
        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("vanha");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
