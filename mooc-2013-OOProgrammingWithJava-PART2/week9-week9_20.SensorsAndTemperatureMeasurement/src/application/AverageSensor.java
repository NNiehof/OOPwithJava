package application;

import java.util.ArrayList;
import java.util.List;

/**
 * AverageSensor.java
 *
 * @author NNiehof
 */

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
    @Override
    public boolean isOn() {
        // Return true only when method isOn() returns true for each sensor
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (this.isOn() && !this.sensors.isEmpty()) {
            int count = 0;
            int sum = 0;
            for (Sensor sensor : this.sensors) {
                sum += sensor.measure();
                count++;
            }
            int average = (sum / count);
            this.readings.add(average);
            return average;
        }
        throw new IllegalStateException("Average sensor must be on and must"
        + " contain sensors");
    }

}
