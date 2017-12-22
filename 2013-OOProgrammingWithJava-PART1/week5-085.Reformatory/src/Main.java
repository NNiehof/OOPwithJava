
public class Main {

    public static void main(String[] args) {
        // test code for class Reformatory
        
        Person person = new Person("Annie", 50, 170, 83);
        Reformatory reform = new Reformatory();
        
        System.out.println(person.getName() + " weight: "
            + reform.weight(person) + " kilos");
        
        reform.feed(person);
        System.out.println(person.getName() + " weight: "
            + reform.weight(person) + " kilos");
    }
}
