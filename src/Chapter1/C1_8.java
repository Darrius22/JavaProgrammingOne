package Chapter1;

/**
 * Program to display The Perimeter of a user inputted radius, and the Area of a
 * user inputted radius.
 *
 * @author Darrius Stewart
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Darrius Stewart 
        double radius = 5.5;

        double perimeter;
        perimeter = 2 * radius * 3.14;

        double area;
        area = radius * radius * 3.14;

        System.out.println("The perimeter is " + perimeter + " of a " + radius + " radius circle");
        System.out.println("The area is " + area + " of a " + radius + " radius circle");
    }
}
