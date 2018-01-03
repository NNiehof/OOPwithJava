import java.util.ArrayList;
import java.util.Collections;

/**
 * Hand.java
 * A hand of cards in a card game.
 *
 * @author NNiehof
 */

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public ArrayList<Card> getHand() {
        return this.hand;
    }
    
    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        // Sort hand array in place
        Collections.sort(this.hand);
    }
    
    @Override
    public int compareTo(Hand otherHand) {
        // Compare hands of cards for largest total value
        int totalValueThisHand = 0;
        int totalValueOtherHand = 0;
        
        for (Card card : this.hand) {
            totalValueThisHand += card.getValue();
        }
        
        for (Card card : otherHand.getHand()) {
            totalValueOtherHand += card.getValue();
        }
        return totalValueThisHand - totalValueOtherHand;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
