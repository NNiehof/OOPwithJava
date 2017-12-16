
public class EvenNumbers {

    public static void main(String[] args) {
        // Print even numbers 2-100

        int num = 2;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num ++;
        }
    }
}
