package dungeon;

/**
 * Player.java
 * Author: nniehof
 */

public class Player extends Agent{

    private String moveCommands;

    public Player(int xBound, int yBound) {
        super("@", 0, 0, xBound, yBound);
        this.moveCommands = "";
    }

    public void addMovements(String moveCommands) {
        this.moveCommands = moveCommands;
    }

    public String getMoveCommands() {
        return this.moveCommands;
    }

    public void move(String command) {
        int[] position = getPosition();
        int[] newPosition = position.clone();
        if (command.equals("w")) {
            // move up
            newPosition[1]--;
        }
        else if (command.equals("s")) {
            // move down
            newPosition[1]++;
        }
        else if (command.equals("a")) {
            // move left
            newPosition[0]--;
        }
        else if (command.equals("d")) {
            // move right
            newPosition[0]++;
        }

        // only move to new position if it is within the map boundaries
        if (withinBoundaries(newPosition)) {
            setPosition(newPosition);
        }
    }
}
