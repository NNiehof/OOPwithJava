public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // Adding 100 suitcases with one brick in each, and each brick one kg
        // heavier than the last.
        for (int index = 0; index < 100; index++) {
            Suitcase suitcase = new Suitcase(1000);
            Thing thing = new Thing("Brick", (index + 1));
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
        }
    }
}