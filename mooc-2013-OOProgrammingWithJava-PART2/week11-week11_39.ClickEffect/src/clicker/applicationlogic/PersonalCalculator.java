package clicker.applicationlogic;

/**
 * PersonalCalculator.java
 * Author: nniehof
 */

public class PersonalCalculator implements Calculator {

    private int count;

    public PersonalCalculator() {
        this.count = 0;
    }

    @Override
    public int giveValue() {
        return this.count;
    }

    @Override
    public void increase() {
        this.count ++;
    }
}
