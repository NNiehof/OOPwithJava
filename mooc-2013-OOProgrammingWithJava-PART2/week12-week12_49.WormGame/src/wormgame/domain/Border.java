package wormgame.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Border.java
 * Author: nniehof
 */

public class Border {

    private List<Piece> border;

    public Border(int minX, int maxX, int minY, int maxY) {
        this.border = new ArrayList<Piece>();
        for (int x = (minX - 1); x <= maxX; x++) {
            this.border.add(new Piece(x, (minY - 1)));
            this.border.add(new Piece(x, maxY));
        }

        for (int y = minY; y < maxY; y++) {
            this.border.add(new Piece((minX - 1), y));
            this.border.add(new Piece(maxX, y));
        }
    }

        public List<Piece> getBorder() {
            return this.border;
        }
    }
