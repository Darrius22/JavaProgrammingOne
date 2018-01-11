package Chapter4;

import java.util.Scanner;

/**
 * Program displays whether the second string is a substring of the first string
 *
 * @author Darrius Stewart
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Darrius Stewart
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1>> ");
        String s1 = input.next();
        s1 = s1.toUpperCase();
        System.out.println("Enter string s2>> ");
        String s2 = input.next();
        s2 = s2.toUpperCase();

        //Compares if the second string is in the main string
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring " + s1);
        }
    }
}
