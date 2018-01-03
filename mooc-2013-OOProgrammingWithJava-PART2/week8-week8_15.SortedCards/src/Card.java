
public class Card implements Comparable<Card> {

    // Card suits as ints for easy indexing and comparing
    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    /*
     * String arrays for suits and values. The places 0 and 1 in VALUES are
     * non-valid and have "-" strings, to make the indexing match the card
     * values. This seems a bit awkward, but I'll leave it in for now as it was
     * in the code skeleton as I got it.
     */
    public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
    public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card otherCard) {
        /* 
         * Compare this card's value to parameter card value.
         * @pre
         * @post int gives the relative distance and ordering of this and
         * otherCard based on value, and if the values are the same, based on
         * suit.
         */
        int rank = this.value - otherCard.getValue();
        if (rank == 0) {
            rank = this.suit - otherCard.getSuit();
        }
        return rank;
    }
    
    @Override
    public String toString() {
        return VALUES[value] + " of " + SUITS[suit];
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

}
