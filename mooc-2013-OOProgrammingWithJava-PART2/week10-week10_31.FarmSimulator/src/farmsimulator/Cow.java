package farmsimulator;

import java.util.Random;

/**
 * Cow.java
 * Author: nniehof
 */

public class Cow implements Milkable, Alive{

    private String name;
    private int capacity;
    private double milkAmount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private Random randomiser;

    public Cow() {
        // assign random name and udder capacity
        this.randomiser = new Random();
        this.name = NAMES[randomiser.nextInt(NAMES.length)];
        this.capacity = 15 + randomiser.nextInt(26);
        this.milkAmount = 0.0;
    }

    public Cow(String name) {
        // give chosen name
        this();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.milkAmount;
    }

    @Override
    public void liveHour() {
        // living an hour makes the cow produce a random amount of milk
        // between 0.7 - 2.0 liters
        double milkProduced = 0.7 + (2.0 - 0.7) * randomiser.nextDouble();
        if ((this.milkAmount + milkProduced) < this.capacity) {
            this.milkAmount += milkProduced;
        }
        else {
            this.milkAmount = this.capacity;
        }

    }

    @Override
    public double milk() {
        // milk the cow, set amount in udder to zero, return the extracted milk
        double milked = this.milkAmount;
        this.milkAmount = 0;
        return milked;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.milkAmount) + "/"
                + Math.ceil(this.capacity);
    }
}
