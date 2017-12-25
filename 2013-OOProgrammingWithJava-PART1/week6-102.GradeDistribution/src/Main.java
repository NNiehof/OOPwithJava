import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        // Read in user input scores until -1 is given. Include only scores in
        // range 0-60.
        while (true) {
            System.out.println("Type exam scores, -1 to stop");
            int score = Integer.parseInt(reader.nextLine());
            if (score >= 0 && score <= 60) {
                scores.add(score);
            } else if (score == -1) {
                break;
            }
        }
        
        // scores into grades
        int[] grades = binGrades(scores);
        
        printHistogram(grades);
    }
    
    public static int[] binGrades(ArrayList<Integer> scores) {
        // Sort scores into bins 0-5, return ArrayList with frequency of each bin.
        
        // Initialise bins 0-5 with zero values
        int[] bins =  {0, 0, 0, 0, 0, 0};
        
        for (int points : scores) {
            if (points < 30) {
                bins[0] ++;
            } else if (points < 35) {
                bins[1] ++;
            } else if (points < 40) {
                bins[2] ++;
            } else if (points < 45) {
                bins[3] ++;
            } else if (points < 50) {
                bins[4] ++;
            } else {
                bins[5] ++;
            }
        }
        return bins;
    }
    
    public static double acceptedScores(int[] gradeFrequencies) {
        // Calculate the percentage of accepted grades (all but grade 0).
        
        // Sum of all grades
        int sum = 0;
        for (int grade : gradeFrequencies) {
            sum += grade;
        }
        
        double accepted = sum - gradeFrequencies[0];
        double acceptedPercentage = 100.0 * accepted / sum;
        return acceptedPercentage;
    }
    
    public static void printHistogram(int[] gradeFrequencies) {
        // Print histogram of the input list with bins 0-5.
        
        System.out.println("Grade distribution: ");
        for (int index = 5; index >= 0; index--) {
            System.out.print(index + ": ");
            // print frequency of each grade as asterisks
            for (int count = 0; count < gradeFrequencies[index]; count++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        // Get the percentage of accepted grades and print this with the histogram.
        double accepted = acceptedScores(gradeFrequencies);
        System.out.println("Acceptance percentage: " + accepted);
    }
}
