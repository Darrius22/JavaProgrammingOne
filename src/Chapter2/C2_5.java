package Chapter2;

import java.util.Scanner;

/**
 * Program displays the tip and total cost of a users meal
 *
 * @author Darrius Stewart
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    //Darrius Stewart
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the meal: ");
        double mealPrice = input.nextDouble();

        System.out.print("Enter Gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double tip;
        tip = (gratuityRate / 100) * mealPrice;

        double total;
        total = mealPrice + tip;

        System.out.println("The tip is: $" + tip);
        System.out.println("The total is $" + total);

    }
}
