package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;

/**
 * PersonComparator.java
 * Author: nniehof
 */

public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int firstNum = getNumber(firstPerson);
        int secondNum = getNumber(secondPerson);

        if (firstNum < secondNum) {
            return 1;
        }
        else if (firstNum > secondNum ) {
            return -1;
        }
        return 0;
    }

    public int getNumber(Person person) {
        if (this.peopleIdentities.containsKey(person)) {
            return this.peopleIdentities.get(person);
        }
        return 0;
    }
}
