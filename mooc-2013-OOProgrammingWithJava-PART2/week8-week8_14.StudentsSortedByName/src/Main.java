
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
               
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("flip"));
        students.add(new Student("henk"));
        students.add(new Student("anja"));
        students.add(new Student("esther"));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
