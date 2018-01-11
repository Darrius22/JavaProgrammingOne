package Chapter3;

import java.util.Scanner;

/**
 * Program displays if a number is divisible by 5 or 6 or both
 *
 * @author Darrius Stewart
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Darrius Stewart
        Scanner input = new Scanner(System.in);
        //Gets number from the user.
        System.out.println("Enter a whole number>> ");
        int userNumber = input.nextInt();

        //Compares if the number is divisible by both 5 and 6.
        if (((userNumber % 5) == 0.0) && ((userNumber % 6) == 0.0)) {
            System.out.println("Is " + userNumber + " divisible by 5 and 6? True");
        } else {
            System.out.println("Is " + userNumber + " divisible by 5 and 6? False");
        }

        //Compares if the number is only divisible by 5 or 6.
        if (((userNumber % 5) == 0.0) || ((userNumber % 6) == 0.0)) {
            System.out.println("Is " + userNumber + " divisible by 5 or 6? True");
        } else {
            System.out.println("Is " + userNumber + " divisible by 5 or 6? False");
        }

        //Compares if it's dvisible by 5 or 6 but not both. 
        if ((((userNumber % 5) == 0.0) || ((userNumber % 6) == 0.0)) ^ (((userNumber % 5) == 0.0) && ((userNumber % 6) == 0.0))) {
            System.out.println("Is " + userNumber + " divisible by 5 or 6 but not both? True");
        } else {
            System.out.println("Is " + userNumber + " divisible by 5 or 6 but not both? False");
        }

    }

}
