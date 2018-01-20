package farmsimulator;

import java.util.ArrayList;

/**
 * Farm.java
 * Author: nniehof
 */

public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }

    @Override
    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }
}
