
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        String str = "{\n}\n";
        StringBuilder composedString = new StringBuilder(str);

        for (int count = 0; count < t.length; count++) {
            if (count == (t.length - 1)) {
                composedString.insert(insertHere(composedString), t[count]);
                composedString.insert(insertHere(composedString), "\n");
            }
            else {
                if (count == 0) {
                    composedString.insert(insertHere(composedString), " ");
                }

                composedString.insert(insertHere(composedString), t[count]);
                composedString.insert(insertHere(composedString), ", ");

                // maximum four values per line
                if (((count + 1) % 4) == 0) {
                    composedString.insert(insertHere(composedString), "\n ");
                }
            }
        }
        return composedString.toString();
    }

    /**
     * Return the second to last position in the string
     * @param str
     * @return
     */
    public static int insertHere(StringBuilder str) {
        return (str.length() - 2);
    }
}
