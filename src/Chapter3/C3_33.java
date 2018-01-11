package Chapter3;

import java.util.Scanner;

/**
 * Program displays the package with the best cost
 *
 * @author Darrius Stewart
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        //Darrius Stewart
        Scanner input = new Scanner(System.in);

        //Tells the user which package it is 
        System.out.println("Package One");

        //Gets weight from the user.
        System.out.println("Enter weight of rice>> ");
        double weight1 = input.nextDouble();

        //Gets price from the user.
        System.out.println("Enter price of rice>> ");
        double price1 = input.nextDouble();

        //Tells the user which package it is 
        System.out.println("Package Two");

        //Gets weight from the user.
        System.out.println("Enter weight of rice>> ");
        double weight2 = input.nextDouble();

        //Gets price from the user.
        System.out.println("Enter price of rice>> ");
        double price2 = input.nextDouble();

        double costPerPound1;
        costPerPound1 = price1 / weight1;

        double costPerPound2;
        costPerPound2 = price2 / weight2;

        //Compares which cost is better
        if (costPerPound1 > costPerPound2) {
            System.out.println("Package 2 has better price");
        } else if (costPerPound2 > costPerPound1) {
            System.out.println("Package 1 has better price");
        } else //This tells if they are equal
        {
            System.out.println("The packages prices are the same");
        }

        //THis is to test if the number are correct.
        /*System.out.println(costPerPound1);
		System.out.println(costPerPound2);*/
    }
}
