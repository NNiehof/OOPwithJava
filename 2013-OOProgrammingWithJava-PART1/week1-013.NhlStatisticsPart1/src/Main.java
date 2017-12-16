
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        // Print top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        // Print top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        // Print stats for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        // Print stats for Philadelphia Flyers
        NHLStatistics.teamStatistics("PHI");
        
        // Print the players in Anaheim Ducks, ordered by points
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
