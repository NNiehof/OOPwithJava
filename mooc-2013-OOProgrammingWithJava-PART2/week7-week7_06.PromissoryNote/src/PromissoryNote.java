import java.util.HashMap;

/**
 * PromissoryNote.java
 * A promissory note in which the issuer promises to pay a certain amount to
 * the payee.
 *
 * @author NNiehof
 */

public class PromissoryNote {
    private HashMap<String, Double> loans;
    
    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        // Store the name of the payee and the amount of debt to that person
        this.loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String toWhom) {
        // Return the amount of debt to the specified payee, if there is a debt
        if (this.loans.containsKey(toWhom)) {
            return this.loans.get(toWhom);
        } else {
            return 0.0;
        }
    }
}
