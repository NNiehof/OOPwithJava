
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] aaa = {1, 2, 3, 4};
        int[] bbb = {4, 4, 4, 4, 4, 5};
        System.out.println(Arrays.toString(aaa));
        int[] aaaCopy = copy(aaa);
        System.out.println(Arrays.toString(aaaCopy));

        aaaCopy[2] = 0;

        // permutation affects copy but not original
        System.out.println(Arrays.toString(aaa));
        System.out.println(Arrays.toString(aaaCopy));
        
        System.out.println(Arrays.toString(reverseCopy(aaa)));
        System.out.println(Arrays.toString(reverseCopy(bbb)));
    }

    public static int[] copy(int[] array) {
        return array.clone();
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int reverseIndex = (array.length - 1) - index;
            reversed[reverseIndex] = array[index];
        }
        return reversed;
    }

}
