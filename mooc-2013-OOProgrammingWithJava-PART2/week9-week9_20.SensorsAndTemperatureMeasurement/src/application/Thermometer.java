package application;

import java.util.Random;

/**
 * Thermometer.java
 *
 * @author NNiehof
 */

public class Thermometer implements Sensor {
    
    private boolean powerState;
    private Random randomiser;
    
    public Thermometer() {
        this.powerState = false;
        this.randomiser = new Random();
    }

    @Override
    public boolean isOn() {
        return this.powerState;
    }

    @Override
    public void on() {
        this.powerState = true;
    }

    @Override
    public void off() {
        this.powerState = false;
    }

    @Override
    public int measure() {
        if (this.isOn()) {
            // random int between -30 and 30
            return (this.randomiser.nextInt(60) - 30);
        }
        throw new IllegalStateException("thermometer is off");
    }

}
