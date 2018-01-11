package Chapter5;

import java.util.Scanner;

/**
 * This program displays a reversed input string
 *
 * @author Darrius Stewart
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Gets string
        System.out.println("Enter a string>> ");
        String s = input.nextLine();

        //Reverses the string
        System.out.println("The reverse string is " + (new StringBuffer(s).reverse().toString()));
    }
}
