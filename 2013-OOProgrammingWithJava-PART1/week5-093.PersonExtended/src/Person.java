
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name, int day, int month, int year) {
        this(name, new MyDate(day, month, year));
    }
    
    public Person(String name) {
        // if birthday is unspecified, set current date as birthday
        this(name, new MyDate());
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        MyDate currentDate = new MyDate();
        
        // return difference in years between birthday and current date as age
        return birthday.differenceInYears(currentDate);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays, return true if this object is
        // older than the parameter
        return this.birthday.earlier(compared.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
