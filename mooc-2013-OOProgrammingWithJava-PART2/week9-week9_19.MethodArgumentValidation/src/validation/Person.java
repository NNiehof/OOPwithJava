package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("I don\'t like your name");
        } else {
            this.name = name;
        }

        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("age must be between 0 and 120");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
