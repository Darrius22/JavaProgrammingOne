package Chapter5;

import java.util.Scanner;

/**
 * Program displays the amount of Yes and No votes
 *
 * @author Darrius Stewart
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Gets vote from user
        System.out.println("Vote Y for Yes. Vote N for No. Enter Q to tally");
        System.out.println("Enter your vote>> ");
        String sVote = input.next().toUpperCase();

        //Compares and adds to the vote count using while loop 
        int yCount = 0;
        int nCount = 0;

        //The while loop compares the vote to tally 
        while (!sVote.equals("Q")) {
            if (sVote.equals("Y")) {
                ++yCount;
            } else if (sVote.equals("N")) {
                ++nCount;
            } else {
                System.out.println("Invalid Code: Enter 'Y' to vote yes, and 'N' to vote no, or 'Q' to quit voting");
            }
            System.out.println("Enter your vote>> ");
            sVote = input.next().toUpperCase();
        }

        //Displays Tallies
        System.out.println("Amount of Yes votes: " + yCount);
        System.out.println("Amount of No votes: " + nCount);
    }
}
