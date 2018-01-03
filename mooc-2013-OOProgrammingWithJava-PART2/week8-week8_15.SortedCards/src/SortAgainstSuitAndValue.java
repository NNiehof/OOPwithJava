import java.util.Comparator;

/**
 * SortAgainstSuitAndValue.java
 * Sort Card objects based on suit, then on value (2-10, J, Q, K, A).
 *
 * @author NNiehof
 */

public class SortAgainstSuitAndValue implements Comparator<Card> {

    /**
     * Compare parameter Card objects based on suit (spades, diamonds, hearts,
     * clubs) and value (2-10, J, Q, K, A). The compare method overrides
     * Comparator.compare
     * @param card1
     * @param card2
     * @return relative distance and ordering of parameter cards based on suit,
     * then on value.
     */
    @Override
    public int compare(Card card1, Card card2) {
        int rank = card1.getSuit() - card2.getSuit();
        // if cards have the same suit, sort by value
        if (rank == 0) {
            rank = card1.getValue() - card2.getValue();
        }
        return rank;
    }
}
