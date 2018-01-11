package Chapter3;

import java.util.Scanner;

/**
 *Programs displays whether you were correct
 or wrong at guessing cpu heads or tails
 *
 * @author Darrius Stewart
 */
public class C3_14 {

    /**
     *Main Method
     *
     * @param args arguments from command line prompt
     */
    //Darrius Stewart
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //This expains which is heads and which is tails.
        System.out.println("0 (zero) is heads");
        System.out.println(" 1 is tails");
        //This gets the users guess of which it's going to land.
        System.out.println("Enter heads or tails>> ");
        int userChoice = input.nextInt();
        //This tells whether the coin is hands or tails. 
        double cpuGuess = Math.random() * 2;
        int guess = (int) cpuGuess;
        /*This compares the users guess to what the coin is and tells you whether 
                you got it right*/
        if (userChoice == guess) {
            System.out.println("You are Correct!");
        } else {
            System.out.println("You are wrong!");
        }

        //Checks if the numbers are correct
        //System.out.println(cpuGuess);
        //System.out.println(guess);
    }
}
