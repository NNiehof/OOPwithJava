import java.util.Scanner;

public class ReversingName {
    // Reverse characters in user's name
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int nameLen = name.length();
        int count = nameLen - 1;
        
        while (count >= 0) {
            System.out.print(name.charAt(count));
            count --;
        }
    }
}
