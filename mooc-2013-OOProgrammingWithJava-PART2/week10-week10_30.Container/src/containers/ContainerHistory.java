package containers;

import java.util.ArrayList;

/**
 * ContainerHistory.java
 * Author: nniehof
 */

public class ContainerHistory {

    private ArrayList<Double> valueHistory;

    public ContainerHistory() {
        this.valueHistory = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.valueHistory.add(situation);
    }

    public void reset() {
        this.valueHistory.clear();
    }

    public double maxValue() {
        if (this.valueHistory.isEmpty()) {
            return 0;
        }

        double maximum = this.valueHistory.get(0);
        for (int index = 0; index < this.valueHistory.size(); index++) {
            double currentValue = this.valueHistory.get(index);
            if (currentValue > maximum) {
                maximum = currentValue;
            }
        }
        return maximum;
    }

    public double minValue() {
        if (this.valueHistory.isEmpty()) {
            return 0;
        }

        double minimum = this.valueHistory.get(0);
        for (int index = 0; index < this.valueHistory.size(); index++) {
            double currentValue = this.valueHistory.get(index);
            if (currentValue < minimum) {
                minimum = currentValue;
            }
        }
        return minimum;
    }

    public double average() {
        if (this.valueHistory.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int index = 0; index < this.valueHistory.size(); index++) {
            sum += this.valueHistory.get(index);
        }
        return (sum / this.valueHistory.size());

    }

    public double greatestFluctuation() {
        /**
         * Return the absolute value of the largest fluctuation, or 0 when the
         * array is empty or contains only one value.
         */
        if (this.valueHistory.isEmpty() || this.valueHistory.size() == 1) {
            return 0;
        }
        double maxFluctuation = 0;
        for (int index = 1; index < this.valueHistory.size(); index++) {
            double currentValue = this.valueHistory.get(index);
            double previousValue = this.valueHistory.get(index - 1);

            double difference = Math.abs(previousValue - currentValue);
            if (difference > maxFluctuation ) {
                maxFluctuation = difference;
            }
        }
        return maxFluctuation;
    }

    public double variance() {
        int sampleSize = this.valueHistory.size();
        if (sampleSize < 2) {
            return 0;
        }
        double mean = this.average();

        double squaredResiduals = 0;
        for (int index = 0; index < sampleSize; index++) {
            double currentValue = this.valueHistory.get(index);
            squaredResiduals += ((currentValue - mean) * (currentValue - mean));
        }
        return (squaredResiduals / (sampleSize - 1));
    }

    @Override
    public String toString() {
        return this.valueHistory.toString();
    }
}
