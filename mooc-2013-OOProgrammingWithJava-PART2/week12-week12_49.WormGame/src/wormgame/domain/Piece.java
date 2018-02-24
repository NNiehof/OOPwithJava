package wormgame.domain;

/**
 * Piece.java
 * Control of visual elements in worm game.
 * Author: nniehof
 */

public class Piece {

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Check whether this piece runs into the piece received as parameter.
     * @param piece
     */
    public boolean runsInto(Piece piece) {
        if (this.x == piece.getX() & this.y == piece.getY()) {
            return true;
        }
        return false;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
