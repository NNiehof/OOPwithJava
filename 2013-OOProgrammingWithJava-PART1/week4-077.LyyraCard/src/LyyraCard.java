
/**
 *
 * @author NNiehof
 */

public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        // pay for economical meal
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        // pay for gourmet meal
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }

    public void loadMoney(double amount) {
        // load money on card
        if (amount >= 0) {
            if ((this.balance + amount) > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }
}
