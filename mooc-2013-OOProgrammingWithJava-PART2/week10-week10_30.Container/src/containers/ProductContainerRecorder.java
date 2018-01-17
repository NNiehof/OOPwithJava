package containers;

/**
 * ProductContainerRecorder.java
 * Author: nniehof
 */

public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity,
                                    double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.history = new ContainerHistory();
        this.history.add(initialVolume);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        double newVolume = super.getVolume();
        this.history.add(newVolume);
    }

    public double takeFromTheContainer(double amount) {
        double amountTaken = super.takeFromTheContainer(amount);
        double newVolume = super.getVolume();
        this.history.add(newVolume);
        return amountTaken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.history + "\n"
                + "Greatest product amount: " + this.history.maxValue() + "\n"
                + "Smallest product amount: " + this.history.minValue() + "\n"
                + "Average: " + this.history.average() + "\n"
                + "Greatest change: " + this.history.greatestFluctuation() + "\n"
                + "Variance: " + this.history.variance());
    }
}
