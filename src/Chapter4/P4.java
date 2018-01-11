package Chapter4;

import java.util.Scanner;

/**
 * Program displays the best price out of the two bidders
 *
 * @author Darrius Stewart
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Darrius Stewart
        Scanner input = new Scanner(System.in);

        //Gets the name, hours of work, and how  much the first bidder charges. 
        System.out.println("Enter your name first bidder>> ");
        String firstBidder = input.next();

        System.out.println("Enter hours of work>> ");
        int firstBidderHours = input.nextInt();

        System.out.println("Enter amount charged per hour>> ");
        double firstBidderCharge = input.nextDouble();

        //Gets the name, hours of work, and how much the second bidder charges. 
        System.out.println("Enter your name second bidder>> ");
        String secondBidder = input.next();

        System.out.println("Enter hours of work>> ");
        int secondBidderHours = input.nextInt();

        System.out.println("Enter amount charged per hour>> ");
        double secondBidderCharge = input.nextDouble();

        double firstCost = firstBidderHours * firstBidderCharge;
        double secondCost = secondBidderHours * secondBidderCharge;

        //Compares the cost to each other to get the best price
        if (firstCost < secondCost) {
            System.out.printf(firstBidder + " cost $%.2f", firstCost);
        } else if (secondCost < firstCost) {
            System.out.printf(secondBidder + " cost $%.2f", secondCost);
        } else if (firstCost == secondCost && firstBidderHours < secondBidderHours) {
            System.out.printf(firstBidder + " cost $%.2f for this amount of hours %d", firstCost, firstBidderHours);
        } else if (firstCost == secondCost && secondBidderHours < firstBidderHours) {
            System.out.printf(secondBidder + " cost $%.2f for this amount of hours %d", secondCost, secondBidderHours);
        } else {
            System.out.println("The Bids are equal");
            System.out.printf("For " + firstBidder + " the amount of hours are %d and cost per hour is $%.2f and total cost is $%.2f \n", firstBidderHours, firstBidderCharge, firstCost);
            System.out.printf("For " + secondBidder + " the amount of hours are %d and cost per hour is $%.2f and total cost is $%.2f ", secondBidderHours, secondBidderCharge, secondCost);
        }
    }
}
