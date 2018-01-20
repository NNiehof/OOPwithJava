package farmsimulator;

/**
 * BulkTank.java
 * Author: nniehof
 */

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank(double capacity) {
        // customer specified capacity
        this.capacity = capacity;
        this.volume = 0;
    }

    public BulkTank() {
        // standard capacity is 2000 liters
        this(2000.0);
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return (this.capacity - this.volume);
    }

    public void addToTank(double amount) {
        // only add a positive amount
        if (amount < 0);
            // if there is not enough space, fill to max capacity
        else if ((this.capacity - this.volume) <= amount) {
            this.volume = this.capacity;
        }
        else {
            this.volume += amount;
        }
    }

    public double getFromTank(double amount) {
        // only take positive amount
        if (amount < 0) {
            return 0.0;
        }
        // if there is not enough in the tank, take what is left in the tank
        else if (amount > this.volume) {
            double takenAmount = this.volume;
            this.volume = 0;
            return takenAmount;
        } else {
            double takenAmount = amount;
            this.volume -= amount;
            return takenAmount;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
