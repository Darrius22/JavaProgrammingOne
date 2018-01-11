package Chapter2;

import java.util.Scanner;

/**
 * Program displays area and volume of a user given radius and length
 *
 * @author Darrius Stewart
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    //Darrius Stewart
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius of the cricle: ");
        double radius = input.nextDouble();

        System.out.print("Enter Length of the circle: ");
        double length = input.nextDouble();

        double area;
        area = radius * radius * Math.PI;

        double volume;
        volume = area * length;

        System.out.println("The area is " + area);

        System.out.println("The volume is " + volume);
    }
}
