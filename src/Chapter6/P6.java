package Chapter6;

import java.util.Scanner;

/**
 * Program converts currency and displays the converted currency
 *
 * @author Darrius Stewart
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        String response = "";
        double dcon;
        String currenS = "";

        //Gets the dollar worth of each types of currency
        System.out.println("How many euros can a dollar buy? ");
        double euroD = input.nextDouble();

        System.out.println("How many Pound Sterling will a dollar buy? ");
        double pS = input.nextDouble();

        System.out.println("How many Yen will a dollar buy? ");
        double yenD = input.nextDouble();

        //Gets the currency they want to buy
        do {
            System.out.println("Enter amount of dollars you want to convert>> ");
            dcon = input.nextDouble();

            System.out.printf(" * E for Euro \n * Y for Yen \n * P for pounds\n");
            System.out.println("Enter the currency you would like to buy>> ");
            currenS = input.next().toUpperCase();

            //
            if (currenS.equals("E")) {
                double euroS = currencyConverter(dcon, euroD);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros", dcon, euroS);
            } else if (currenS.equals("Y")) {
                double yenS = currencyConverter(dcon, yenD);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen", dcon, yenS);
            } else if (currenS.equals("P")) {
                double pSd = currencyConverter(dcon, pS);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Pounds Sterlings", dcon, pSd);
            } else {
                System.out.println("Invalid Input");
            }

            do {
                System.out.println("\nAre there more conversions to perform? ");
                response = input.next();
            } while (!(response.equalsIgnoreCase("yes")) || (response.equalsIgnoreCase("no")));

        } while (!response.equalsIgnoreCase("no"));
    }

    /**
     * Currency Converter Method
     *
     * @param dcon amount dollars we are converting
     * @param currency amount of currency we are converting
     * @return the amount of dollars the currency is equivalent too
     */
//This is the currency calculation method
    public static double currencyConverter(double dcon, double currency) {
        double tax, converted_money;
        if (dcon > 100) {
            double taxR = dcon * .05;
            tax = dcon - taxR;
            converted_money = tax * currency;

        } else {
            double taxR = dcon * .10;
            tax = dcon - taxR;
            converted_money = tax * currency;
        }

        return converted_money;
    }
}
