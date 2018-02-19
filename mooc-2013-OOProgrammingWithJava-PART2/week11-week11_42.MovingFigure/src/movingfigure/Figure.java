package movingfigure;

import java.awt.Graphics;


/**
 * Figure.java
 * Abstract class for a visual object that can move on screen
 * @author NNiehof
 */

public abstract class Figure {

    private int x;
    private int y;
    
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract void draw(Graphics graphics);
    
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}
