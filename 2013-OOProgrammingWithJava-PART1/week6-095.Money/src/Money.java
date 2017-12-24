
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        // Add Money amount 'added' to the instance from which the method is
        // called, then return a new Money object with this sum
        Money summed = new Money((this.euros + added.euros),
                (this.cents + added.cents));
        return summed;
    }

    public Money minus(Money decremented) {
        // Subtract the amount in the parameter from the object from which method
        // was called, then return Money object with tat value
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;

        if (newCents < 0) {
            newEuros -= 1;
            newCents = (this.cents + 100) - decremented.cents;
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        Money subtracted = new Money(newEuros, newCents);
        return subtracted;
    }

    public boolean less(Money compared) {
        // returns true if the object for which the method was called is less
        // valuable than the object given as parameter
        if (this.euros < compared.euros) {
            return true;
        } else if ((this.euros == compared.euros) && (this.cents < compared.cents)) {
            return true;
        } else {
            return false;
        }
    }

}
