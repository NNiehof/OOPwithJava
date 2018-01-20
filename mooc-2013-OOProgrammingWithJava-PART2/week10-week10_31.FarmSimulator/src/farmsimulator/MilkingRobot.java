package farmsimulator;

/**
 * MilkingRobot.java
 * Author: nniehof
 */

public class MilkingRobot {

    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void milk(Milkable milkable) {
        double milked = milkable.milk();
        if (this.tank instanceof BulkTank) {
            this.tank.addToTank(milked);
        }
        else {
            throw new IllegalStateException(" The MilkingRobot hasn't been installed");
        }
    }
}
