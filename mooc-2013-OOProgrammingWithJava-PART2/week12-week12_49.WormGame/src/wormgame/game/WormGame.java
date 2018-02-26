package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
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

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

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

        if (borderCollision()) {
            this.continues = false;
            return;
        }
        this.worm.move();

        if (this.worm.runsInto(this.apple)) {
            if (borderCollision()) {
                this.continues = false;
                return;
            }
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

        updatable.update();

        setDelay(1000 / this.worm.getLength());
    }

    /**
     * Returns true if a next call to worm.grow would make
     * the worm collide with the border.
     * @return
     */
    public boolean borderCollision() {
        Piece head = this.worm.getHead();
        int x = head.getX();
        int y = head.getY();
        Direction dir = this.worm.getDirection();

        if (x == (this.width - 1) & dir == Direction.RIGHT) {
            return true;
        }

        if (x == 0 & dir == Direction.LEFT) {
            return true;
        }

        if (y == (this.height - 1) & dir == Direction.DOWN) {
            return true;
        }

        if (y == 0 & dir == Direction.UP) {
            return true;
        }

        return false;
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
