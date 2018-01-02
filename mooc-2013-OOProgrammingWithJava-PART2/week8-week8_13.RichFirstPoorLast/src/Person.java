public class Person implements Comparable<Person> {

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person person) {
        // Override the Comparable compareTo method to sort people by salary
        return person.getSalary() - this.salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}
