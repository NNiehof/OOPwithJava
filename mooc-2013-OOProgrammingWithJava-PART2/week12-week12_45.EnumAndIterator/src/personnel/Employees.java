package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Employees.java
 * Author: nniehof
 */

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            this.employees.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        // print all employees whose education is the same as the argument
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        // delete all employees whose education is the same as the argument
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
