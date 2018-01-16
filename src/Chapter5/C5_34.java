package Chapter5;

import java.util.Scanner;

/**
 * Program displays the winner of a game of Rock, Paper, scissors
 *
 * @author Darrius Stewart
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Gets 
        System.out.printf("Enter 1 for rock\nEnter 2 for Scissor\nEnter 3 for Paper\n");
        System.out.println("Enter 1,2, or 3>> ");
        int uGuess = input.nextInt();

        int cpuGuess = (1 + (int) Math.random() * 3);
        System.out.println("Cpu guess>> " + cpuGuess);

        int userScore = 0;
        int cpuScore = 0;

        //the loop that ask and compares your guess to computere
        while ((cpuScore < 3) && (userScore < 3)) {
            if ((uGuess == 1) && (cpuGuess == 2)) {
                System.out.println("User wins");
                ++userScore;
            } else if ((uGuess == 1) && (cpuGuess == 3)) {
                System.out.println("Computer Wins");
                ++cpuScore;
            } else if ((uGuess == 1) && (cpuGuess == 1)) {
                System.out.println("It's a Tie, Try Again");
            } else if ((uGuess == 2) && (cpuGuess == 1)) {
                System.out.println("Computer Wins");
                ++cpuScore;
            } else if ((uGuess == 2) && (cpuGuess == 3)) {
                System.out.println("User Wins");
                ++userScore;
            } else if ((uGuess == 2) && (cpuGuess == 2)) {
                System.out.println("It's a Tie, Try Again");
            } else if ((uGuess == 3) && (cpuGuess == 1)) {
                System.out.println("User Wins");
                ++userScore;
            } else if ((uGuess == 3) && (cpuGuess == 2)) {
                System.out.println("Computer Wins");
                ++cpuScore;
            } else if ((uGuess == 3) && (cpuGuess == 3)) {
                System.out.println("It's a Tie, Try Again");
            } else {
                System.out.println("Invalid Input. Try Again");
            }

            //This re ask the question of your guess
            System.out.printf("Enter 1 for rock\nEnter 2 for Scissor\nEnter 3 for Paper\n");
            System.out.println("Enter 1,2, or 3>> ");
            uGuess = input.nextInt();

            cpuGuess = (int) (1 + Math.random() * 3);
            System.out.println("Cpu guess>> " + cpuGuess);
        }

        //The loop decides who won
        if (userScore > cpuScore) {
            System.out.println("The user won more than two times");
        } else {
            System.out.println("THe computer won more than two times");
        }
        //Displays the final score, and who won. 
        System.out.println("User score " + userScore);
        System.out.println("CPU score  " + cpuScore);
    }
}
