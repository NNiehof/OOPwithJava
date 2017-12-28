
/**
 * Main.java
 *
 * @author NNiehof
 */
public class Main {

    public static void main(String[] args) {
        ToBeStored book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        ToBeStored book2 = new Book("Robert Martin", "Clean Code", 1);
        ToBeStored book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        ToBeStored cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        ToBeStored cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        ToBeStored cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        Box box1 = new Box(1.5);
        box1.add(cd1);
        box1.printAll();
        System.out.println("");
        box1.add(book2);
        box1.printAll();
        System.out.println("");
        box1.add(book3);
        box1.printAll();
        System.out.println("");
        
        Box box2 = new Box(10.0);
        box2.add(box1);
        System.out.println(box2);
        box2.add(box2);
        System.out.println(box2);
    }

}
