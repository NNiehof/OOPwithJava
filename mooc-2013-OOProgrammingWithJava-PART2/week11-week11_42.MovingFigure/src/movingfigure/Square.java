package movingfigure;

import java.awt.Graphics;


/**
 * Square.java
 *
 * @author NNiehof
 */

public class Square extends Figure {

    private int sideLength;
    
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), sideLength, sideLength);
    }

}
