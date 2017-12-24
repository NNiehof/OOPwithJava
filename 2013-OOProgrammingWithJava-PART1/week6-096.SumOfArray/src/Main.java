
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        // Sum of elements in array
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
