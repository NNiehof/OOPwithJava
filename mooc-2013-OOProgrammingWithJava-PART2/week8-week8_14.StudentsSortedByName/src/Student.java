public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Student otherStudent) {
        // Use String's compareTo method to compare Student objects based on
        // their names
        return this.name.compareTo(otherStudent.getName());
    }

    @Override
    public String toString() {
        return name;
    }

}
