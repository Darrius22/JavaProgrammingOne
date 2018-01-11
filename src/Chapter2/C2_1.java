package Chapter2;

import java.util.Scanner;

/**
 *Program displays the conversion of celsius to fahrenheit
 *
 * @author Darrius Stewart
 */
public class C2_1 {

    /**
     *Main Method
     *
     * @param args arguments from command line prompt
     */
    //Darrius Stewart
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Celsius degree to convert: ");
        double celsius = input.nextDouble();

        double farenheit;
        farenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + farenheit + " Fahrenheit");
    }
}
