package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Dungeon.java
 * Author: nniehof
 */

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private Random random;
    private Player player;
    private ArrayList<Agent> agents;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves,
                   boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.random = new Random();
        this.agents = new ArrayList<Agent>();
        this.player = new Player(length, height);
        this.reader = new Scanner(System.in);
    }

    public void run() {
        createVampires();

        while (this.moves > 0) {
            // print out number of moves and positions of all agents
            System.out.println(this.moves + "\n");
            System.out.println(player);
            for (Agent vampire : agents) {
                System.out.println(vampire);
            }
            System.out.println("");

            ArrayList<String> map = Map.makeMap(this.player, this.agents,
                    this.length, this.height);
            Map.printMap(map);
            System.out.println("");

            this.player.addMovements(reader.nextLine());
            movement();
            this.moves--;

            // when all vampires are dead, player has won the game
            if (this.vampires == 0) {
                System.out.println("YOU WIN");
                break;
            }
        }
        if (this.moves == 0) {
            System.out.println("YOU LOSE");
        }
    }

    public void createVampires() {
        for (int index = 0; index < this.vampires; index++) {
            // generate random starting position for vampire
            int[] position = new int[2];
            while (true) {
                position[0] = random.nextInt(this.length);
                position[1] = random.nextInt(this.height);
                if ((!agentAtPosition(position)) && !(position[0] == 0 &&
                        position[1] == 0)) {
                    this.agents.add(new Vampire(position[0], position[1],
                            this.length, this.height));
                    break;
                }
            }
        }
    }

    public boolean agentAtPosition(int[] position) {
        /**
         * Check whether an agent is already present at the argument position
         */
        if (this.agents.isEmpty()) {
            return false;
        }

        // check for other agents at the given position
        for (Agent agent : this.agents) {
            int[] agentPosition = agent.getPosition();
            if ((agentPosition[0] == position[0])
                    && (agentPosition[1] == position[1])) {
                return true;
            }
        }
        return false;
    }

    public void movement() {
        String playerMoves = this.player.getMoveCommands();
        // execute movement commands one at a time
        for (int index = 0; index < playerMoves.length(); index++) {
            String command = Character.toString(playerMoves.charAt(index));
            this.player.move(command);

            // move the vampires, then check again for collisions with the player
            if (this.vampiresMove) {
                this.moveAllVampires();
            }
            // any vampire at the same position as the player dies
            collisionDetection();

        }
    }

    public void collisionDetection() {
        /**
         * When a vampire is at the same position as the player, delete
         * that vampire
         */
        int[] playerPosition = player.getPosition();
        ArrayList<Agent> toBeRemoved = new ArrayList<Agent>();

        for (Agent agent : this.agents) {
            int[] vampirePosition = agent.getPosition();
            if ((vampirePosition[0] == playerPosition[0]) &&
                    (vampirePosition[1] == playerPosition[1])) {
                toBeRemoved.add(agent);
            }
        }
        this.agents.removeAll(toBeRemoved);
        this.vampires -= toBeRemoved.size();
    }

    public void moveAllVampires() {
        for (Agent vampire : this.agents) {
            int randomMove = random.nextInt(4);
            int[] vampirePosition = vampire.getPosition();
            int[] newPosition = vampirePosition.clone();

            if (randomMove == 0) {
                // move up
                newPosition[1]--;
            }
            else if (randomMove == 1) {
                // move down
                newPosition[1]++;
            }
            else if (randomMove == 2) {
                // move left
                newPosition[0]--;
            }
            else if (randomMove == 3) {
                // move right
                newPosition[0]++;
            }

            if (vampire.withinBoundaries(newPosition) &&
                    (!agentAtPosition(newPosition))) {
                vampire.setPosition(newPosition);
            }
        }

    }

}
