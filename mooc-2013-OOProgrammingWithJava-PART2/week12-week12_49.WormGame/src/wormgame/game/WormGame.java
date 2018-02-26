package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Border;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random random;
    private Border border;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.border = new Border(0, this.width, 0, this.height);

        this.worm = new Worm((this.width / 2), (this.height / 2), Direction.DOWN);

        // spawn apple at random location
        this.random = new Random();
        while (true) {
            int appleX = random.nextInt(this.width);
            int appleY = random.nextInt(this.height);

            if (!(this.worm.runsInto(new Piece(appleX, appleY)))) {
                this.apple = new Apple(appleX, appleY);
                break;
            }
        }

        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }

        this.worm.move();

        if (this.worm.runsInto(this.apple)) {
            this.worm.grow();

            while (true) {
                int appleX = random.nextInt(this.width);
                int appleY = random.nextInt(this.height);

                if (!(this.worm.runsInto(new Piece(appleX, appleY)))) {
                    this.apple = new Apple(appleX, appleY);
                    break;
                }
            }
        }

        if (this.worm.runsIntoItself()) {
            this.continues = false;
        }

        // check for collisions with border
        List<Piece> borderPieces = this.border.getBorder();
        for (Piece borderPiece : borderPieces) {
            if (this.worm.runsInto(borderPiece)) {
                this.continues = false;
                System.out.println();
                System.out.println("false on piece " + borderPiece);
                break;
            }
        }

        updatable.update();

        setDelay(1000 / this.worm.getLength());
    }

    public Worm getWorm() {
        return this.worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

}
