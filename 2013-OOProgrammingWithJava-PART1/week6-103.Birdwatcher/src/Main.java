import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdWatching birdDatabase = new BirdWatching();
        
        while (true) {
            System.out.println("?");
            String command = reader.nextLine().toLowerCase();
            
            if (command.contains("add")) {
                // Ask for name and latin name, add bird object to list
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin name: ");
                String latinName = reader.nextLine();
                
                birdDatabase.add(new Bird(name, latinName));
                
            } else if (command.contains("observation")) {
                System.out.println("What was observed:?");
                String observedName = reader.nextLine().toLowerCase();
                
                // if the bird is in the list, add an observation
                boolean birdFound = false;
                for (Bird item : birdDatabase.birdList()) {
                    if (item.name().toLowerCase().contains(observedName)) {
                        item.addObservation();
                        birdFound = true;
                    }
                }
                if (!birdFound) {
                    System.out.println("Is not a bird!");
                }
            } else if (command.contains("statistics")) {
                // Show statictics of all birds in list
                birdDatabase.statistics();
                
            } else if (command.contains("show")) {
                System.out.println("What? ");
                String name = reader.nextLine();
                
                // Show statictics of the specified bird
                for (Bird birdItem : birdDatabase.birdList()) {
                    if (birdItem.name().contains(name)) {
                        birdItem.show();
                    }
                }
            } else if (command.contains("quit")) {
                break;
            }
        }
            
    }

}
