import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

/**
 * JumpPoints.java Assign points to Jumper object, based on a pseudorandomly
 * generated jump length and 5 pseudorandomly generated judge votes.
 * Generate a simulated jump by calling the jump method.
 *
 * @author NNiehof
 */
public class JumpPoints {

    private Jumper jumper;
    private Integer[] judges;
    private int jumpDistance;
    private Random random;

    public JumpPoints(Jumper jumper) {
        this.jumper = jumper;
        this.judges = new Integer[5];
        this.jumpDistance = 0;
        random = new Random();
    }

    public void jump() {
        // generate jump length
        jumpLength();
        // generate 5 judge's votes
        for (int index = 0; index < 5; index++) {
            this.judges[index] = judgeVote();
        }
        // assign the points to the jumper
        assignPoints();
    }

    public void jumpLength() {
        // random distance value between 60-120
        jumpDistance = (random.nextInt(60) + 60);
        this.jumper.addJump(jumpDistance);
    }

    public int judgeVote() {
        // random vote from a judge between 10-20
        return (random.nextInt(10) + 10);
    }
    
    public void assignPoints() {
        // Sort judge votes, exclude the lowest and highest
        Arrays.sort(this.judges);
        int points = this.jumpDistance;
        for (int voteRank = 1; voteRank < 4; voteRank++) {
            points += judges[voteRank];
        }
        
        // Get current points total of the jumper, add the new points
        this.jumper.setPoints((this.jumper.getPoints() + points));
    }
    
    @Override
    public String toString() {
        String judgeString = "[";
        for (int vote = 0;  vote < 5; vote++) {
            judgeString += this.judges[vote];
            if (vote < 4) {
                judgeString += ", ";
            } else {
                judgeString += "]";
            }
        }
        return ("  " + this.jumper.getName() + "\n    length: "
                + this.jumpDistance + "\n    judge votes: " + judgeString);
    }

}
