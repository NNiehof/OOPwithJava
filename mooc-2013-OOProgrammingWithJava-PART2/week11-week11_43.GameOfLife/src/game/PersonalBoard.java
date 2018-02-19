package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

/**
 * PersonalBoard.java
 * Implementation of John Conway's Game of Life
 * Author: nniehof
 */

public class PersonalBoard extends GameOfLifeBoard {

    private int width;
    private int height;

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probability) {
        Random random = new Random();

        // iterate over all cells
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (random.nextDouble() < probability) {
                    getBoard()[x][y] = true;
                }
                else {
                    getBoard()[x][y] = false;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (isInsideBoard(x, y)) {
            return getBoard()[x][y];
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (isInsideBoard(x, y)) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (isInsideBoard(x, y)) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int nLivingNeighbours = 0;

        // iterate through horizontal neighbours [x - 1] to [x + 1]
        for (int h = x - 1; h <= x + 1; h++) {
            // vertical neighbours [y - 1] to [y + 1]
            for (int v = y - 1; v <= y + 1; v++) {
                if (isAlive(h, v) & !(h == x & v == y)) {
                    nLivingNeighbours++;
                }
            }
        }
        return nLivingNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int nLivingNeighbours) {
        // living cells
        if (isAlive(x, y)) {
            if (nLivingNeighbours < 2) {
                turnToDead(x, y);
            }
            else if (nLivingNeighbours <= 3) {}
            else {
                turnToDead(x, y);
            }
        }
        // dead cells
        else {
            if (nLivingNeighbours == 3) {
                turnToLiving(x, y);
            }
        }
    }

    public boolean isInsideBoard(int x, int y) {
        if (x >= 0 & x < getWidth() & y >= 0 & y < getHeight()) {
            return true;
        }
        return false;
    }
}
