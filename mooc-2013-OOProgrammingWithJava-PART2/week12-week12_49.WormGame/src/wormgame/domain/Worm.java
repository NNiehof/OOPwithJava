package wormgame.domain;

import wormgame.Direction;

import java.util.LinkedList;
import java.util.List;

/**
 * Worm.java
 * Author: nniehof
 */

public class Worm {

    private LinkedList<Piece> segments;
    private Direction direction;
    private Piece newSegment;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.segments = new LinkedList<Piece>();
        this.segments.add(new Piece(originalX, originalY));
        this.direction = originalDirection;
        this.newSegment = null;
    }

    public void move() {
        // add new segment if grow method has been called
        // outside of move
        if (!(this.newSegment == null)) {
            this.segments.add(this.newSegment);
            this.newSegment = null;
        }
        else {
            grow();

            // remove oldest segment
            if (getLength() >= 3) {
                this.segments.removeFirst();
            }

            // add new segment
            this.segments.add(this.newSegment);
            this.newSegment = null;
        }
    }

    public void grow() {
        // get coordinates of current head
        Piece head = getHead();
        int x = head.getX();
        int y = head.getY();

        // determine coordinates of new Piece
        switch (getDirection()) {
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
        this.newSegment = new Piece(x, y);
    }

    public boolean runsInto(Piece piece) {
        for (Piece segment : this.segments) {
            if (segment.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int segmentIndex = 0; segmentIndex < (getLength() - 1); segmentIndex++) {

            // compare segment to all segments but itself
            for (int compareSegmentIndex = (segmentIndex + 1);
                 compareSegmentIndex < getLength(); compareSegmentIndex++) {

                Piece firstSegment = this.segments.get(segmentIndex);
                Piece secondSegment = this.segments.get(compareSegmentIndex);
                if (firstSegment.runsInto(secondSegment)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return this.segments.size();
    }

    public List<Piece> getPieces() {
        return this.segments;
    }

    public Piece getHead() {
        return this.segments.get(getLength() - 1);
    }
}
