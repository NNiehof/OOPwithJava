
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // test code
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // Find and return smallest value in array
        return smallestStartingFrom(array, 0);
    }

    public static int smallestStartingFrom(int[] array, int index) {
        // Find and return smallest value in array starting from index
        int smallest = array[index];
        for (int count = index; count < array.length; count++) {
            if (smallest > array[count]) {
                smallest = array[count];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // Index of the smallest value in the array
        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // Index of the smallest value in the array starting at index
        int smallestValue = smallestStartingFrom(array, index);
        for (int count = index; count < array.length; count++) {
            if (array[count] == smallestValue) {
                return count;
            }
        }
        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        // Swap the values at index1 and index2 in the array
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }

    public static void sort(int[] array) {
        // bubblesort:
        // find index of smallest value starting from current index, and
        // swap the values to put the smallest value at the current index.
        System.out.println(Arrays.toString(array));
        for (int index = 0; index < array.length; index++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, index);
            swap(array, index, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
