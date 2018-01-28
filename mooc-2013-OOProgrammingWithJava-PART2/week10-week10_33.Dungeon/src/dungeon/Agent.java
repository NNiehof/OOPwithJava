package dungeon;

/**
 * Agent.java
 * Author: nniehof
 */

public abstract class Agent {

    private String name;
    private int[] position;
    private int[] boundaries;

    public Agent(String name, int xPosition, int yPosition,
                 int xBound, int yBound) {
        this.name = name;
        this.position = new int[]{xPosition, yPosition};
        this.boundaries = new int[]{xBound, yBound};
    }

    public int[] getPosition() {
        return this.position;
    }

    public void setPosition(int[] position) {
        if (position.length == 2) {
            this.position = position;
        }
        else {
            throw new IllegalArgumentException("position argument must have"
                    + " length 2");
        }
    }

    public boolean withinBoundaries(int[] newPosition) {
        /**
         * Checks whether a new agent position fits within the map boundaries
         */
        if ((newPosition[0] < 0) || (newPosition[1] < 0)) {
            return false;
        }
        if ((newPosition[0] >= this.boundaries[0]) ||
                (newPosition[1] >= this.boundaries[1])) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.position[0] + " " + this.position[1];
    }

}
