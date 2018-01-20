package farmsimulator;

import java.util.Collection;

/**
 * Barn.java
 * Author: nniehof
 */

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        // connect the milking robot to the barn's bulk tank
        this.milkingRobot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) {
        if (this.milkingRobot instanceof MilkingRobot) {
            this.milkingRobot.milk(cow);
        }
        else {
            throw new IllegalStateException("No MilkingRobot has been installed yet.");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        for (Cow cow : cows) {
            takeCareOf(cow);
        }
    }

    @Override
    public String toString() {
        return "Barn: " + this.tank;
    }
}
