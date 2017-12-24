
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Print the elements of an array on one line, separated by commas
        for (int index = 0; index < (array.length -1); index++) {
            System.out.print(array[index] + ", ");
        }
        // print last element without trailing comma and whitespace
        System.out.println(array[(array.length - 1)]);
    }
}
