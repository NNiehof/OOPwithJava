
/**
 * Purchase.java
 * Class for purchases as part of the shopping basket functionality in an
 * online shop
 *
 * @author NNiehof
 */

public class Purchase {

    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        // Return total purchase price
        return (this.amount * this.unitPrice);
    }
    
    public void increaseAmount() {
        // Increase purchase amount by one
        this.amount++;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }
}
