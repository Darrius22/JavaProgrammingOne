package Chapter2;

import java.util.Scanner;

/**
 *Program displays price of food, sales tax amount, 
 tip amount the user should give, and total cost of 
 food of users meal
 *
 * @author Darrius Stewart
 */
public class P2 {

    /**
     *Main Method
     *
     * @param args arguments from command line prompt
     */
    //Darrius Stewart
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of the meal: ");
        double meal = input.nextDouble();

        System.out.print("Enter price of drinks: ");
        double drink = input.nextDouble();

        System.out.print("Enter price of desert: ");
        double dessert = input.nextDouble();

        double subtotal;
        subtotal = meal + drink + dessert;

        double tax;
        tax = subtotal * .10;

        double tip;
        tip = (subtotal + tax) * .15;

        double totalCost;
        totalCost = tip + tax + subtotal;

        System.out.println("Price of food $" + subtotal);
        System.out.println("Sales Tax amount $" + tax);
        System.out.println("Tip amount: $" + tip);
        System.out.println("Total cost of food: $" + totalCost);
    }
}
