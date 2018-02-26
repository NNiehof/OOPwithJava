package wormgame;

import javax.swing.SwingUtilities;

import wormgame.domain.Border;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        Border border = new Border(0,3, 0, 2);
        System.out.println(border.getBorder());

    }
}
