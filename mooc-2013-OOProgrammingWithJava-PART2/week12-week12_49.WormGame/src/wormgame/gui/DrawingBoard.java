package wormgame.gui;


import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;


/**
 * DrawingBoard.java
 *
 * @author NNiehof
 */

public class DrawingBoard extends JPanel implements Updatable {
    
    private WormGame wormGame;
    private int pieceLength;
    
    public DrawingBoard(WormGame wormGame, int pieceLength) {
        super.setBackground(Color.GRAY);
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

            //  Draw the worm piece by piece
        graphics.setColor(Color.BLACK);
        List<Piece> wormSegments = this.wormGame.getWorm().getPieces();
        for (Piece segment : wormSegments) {
            int x = segment.getX();
            int y = segment.getY();
            graphics.fill3DRect((x * pieceLength), (y * pieceLength), pieceLength, pieceLength, true);
        }
        
        Apple apple = this.wormGame.getApple();
        int appleX = apple.getX();
        int appleY = apple.getY();
        graphics.setColor(Color.RED);
        graphics.fillOval(appleX, appleY, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }
    
    
}
