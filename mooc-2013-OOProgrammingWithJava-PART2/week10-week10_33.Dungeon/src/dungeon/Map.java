package dungeon;

import java.util.ArrayList;

/**
 * Map.java
 * Author: nniehof
 */

public class Map {

    public Map() {}

    public static ArrayList<String> makeMap(Agent player,
                                            ArrayList<Agent> agents,
                                            int length,
                                            int height) {
        // put player into agents list for easy iterating
        ArrayList<Agent> allAgents = (ArrayList<Agent>) agents.clone();
        allAgents.add(player);
        ArrayList<String> map = new ArrayList<String>();
        for (int heightIndex = 0; heightIndex < height; heightIndex++) {

            // construct each row of the map out of dots
            String line = "";
            for (int lengthIndex = 0; lengthIndex < length; lengthIndex++) {
                // if there is an agent at the current position, add the name
                // of that agent. If not, add a dot.
                boolean agentAtMapPosition = false;
                for (Agent agent : allAgents) {
                    int[] agentPosition = agent.getPosition();
                    if ((agentPosition[0] == lengthIndex) &&
                            (agentPosition[1] == heightIndex)) {
                        line += agent.getName();
                        agentAtMapPosition = true;
                        break;
                    }
                }
                if (!agentAtMapPosition) {
                    line += ".";
                }
            }
            map.add(line);
        }
        return map;
    }

    public static void printMap(ArrayList<String> map) {
        for (String line : map) {
            System.out.println(line);
        }
    }
}
