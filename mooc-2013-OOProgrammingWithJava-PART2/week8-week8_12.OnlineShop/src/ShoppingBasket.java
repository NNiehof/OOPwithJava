
import java.util.Map;
import java.util.HashMap;

/**
 * ShoppingBasket.java Shopping basket class that keeps track of purchases in an
 * online shop
 *
 * @author NNiehof
 */
public class ShoppingBasket {

    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        // Add a purchase to the shopping basket, or increase the amount if the
        // product is already in the shopping basket
        if (!this.purchases.containsKey(product)) {
            this.purchases.put(product, new Purchase(product, 1, price));
        } else {
            this.purchases.get(product).increaseAmount();
        }
    }

    public int price() {
        // Return shopping basket total price
        int totalPrice = 0;
        for (Purchase purchase : this.purchases.values()) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print() {
        // Print products and their amounts in the shopping basket
        for (Purchase purchase : this.purchases.values()) {
            System.out.println(purchase);
        }
    }
}
