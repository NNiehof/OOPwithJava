package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;


/**
 * CompoundFigure.java
 *
 * @author NNiehof
 */

public class CompoundFigure extends Figure {

    private ArrayList<Figure> figures;
    
    public CompoundFigure(int x, int y) {
        super(x, y);
        this.figures = new ArrayList();
    }
    
    public CompoundFigure() {
        // position of CompoundFigure itself is trivial and unused
        this(0, 0);
    }
    
    public void add(Figure f) {
        this.figures.add(f);
    }
    
    @Override
    public void draw(Graphics graphics) {
        for (Figure f : this.figures) {
            f.draw(graphics);
        }
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Figure f : this.figures) {
            f.move(dx, dy);
        }
    }

}
