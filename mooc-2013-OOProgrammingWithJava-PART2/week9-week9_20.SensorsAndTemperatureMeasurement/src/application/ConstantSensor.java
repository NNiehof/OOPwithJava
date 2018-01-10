package application;

/**
 * ConstantSensor.java
 *
 * @author NNiehof
 */

public class ConstantSensor implements Sensor {

    private int measurement;
    
    public ConstantSensor(int measurement) {
        this.measurement = measurement;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        // does nothing, constant sensor is always on
    }

    @Override
    public void off() {
        // does nothing, constant sensor is always on
    }

    @Override
    public int measure() {
        return this.measurement;
    }

}
