
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Jumper> jumpers = new ArrayList<Jumper>();

        // First part: create jumpers from user input
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time;"
                + " an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            jumpers.add(new Jumper(name));
        }

        // Second part: jumping phase. Jumpers jump in order of points total,
        // from least points to most.
        int roundCounter = 0;
        System.out.println("\nThe tournament begins!");

        while (true) {
            // Sort jumpers by points
            Collections.sort(jumpers);

            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String userCommand = reader.nextLine();
            if (!userCommand.equals("jump")) {
                break;
            }

            roundCounter++;
            System.out.println("\nRound " + roundCounter);

            // Print ordered jumpers with an index
            System.out.println("\nJumping order:");
            int index = 0;
            for (Jumper jumper : jumpers) {
                index++;
                System.out.println("  " + index + ". " + jumper);
            }

            // Simulate jumps and assign points to jumpers
            System.out.println("\nResults of round " + roundCounter);
            for (Jumper jumper : jumpers) {
                JumpPoints simulatedJump = new JumpPoints(jumper);
                // perform the jump
                simulatedJump.jump();
                // print results
                System.out.println(simulatedJump);
            }
        }

        // Final part: give tournament results
        System.out.println("\nThanks!");
        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        int placeInTournament = 0;
        
        // Reverse jumpers sorting order: from most points to least points
        Collections.reverse(jumpers);
        
        for (Jumper jumper : jumpers) {
            placeInTournament++;

            // get string with all jump lengths for this jumper
            String jumpLengths = "";
            for (int index = 0; index < roundCounter; index++) {
                jumpLengths += (jumper.getJump(index) + " m");
                if (index < (roundCounter - 1)) {
                    jumpLengths += ", ";
                }
            }
            System.out.println(placeInTournament + "           " + jumper
                    + "\n            jump lengths: " + jumpLengths);
        }
    }
}

