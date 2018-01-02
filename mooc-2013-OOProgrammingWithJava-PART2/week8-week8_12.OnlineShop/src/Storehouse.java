
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * StoreHouse.java
 * Class to keep the inventory of an online shop
 *
 * @author NNiehof
 */
public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        // Add product price, and number in stock
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        // Return product price if it is listed, otherwise return -99
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        // Return the number in stock of the product
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        // Decrease stock of product by one, return true if the product was
        // available, otherwise don't decrease stock and return false
        int numberInStock = stock(product);
        if (numberInStock > 0) {
            this.stock.put(product, (numberInStock - 1));
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        // Return name Set of all products in the Storehouse
        return this.prices.keySet();
    }
}
