
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                // If empty input is given, display the Student objects in the
                // list, then stop the program.
                for (Student student : list) {
                    System.out.println(student);
                }
                break;
            }
            // if a name is given, ask for a student number
            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();
            list.add( new Student(name, studentnumber));
        }
        
        // Search the name in the list for a given search term
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
