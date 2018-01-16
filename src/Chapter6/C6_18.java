package Chapter6;

import java.util.Scanner;

/**
 * Program checks to see if password is valid, and displays if its valid or not
 *
 * @author Darrius Stewart
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password>> ");
        String uPass = input.next();

        if (isValid(uPass)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * Program checks if password is valid
     *
     * @param uPass is the user inputed password
     * @return true or false depending on if password is valid or not
     */
    public static boolean isValid(String uPass) {
        int counter = 0;
        // 8 charcters
        if (uPass.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }
        // digits and characters
        for (int i = 0; i < uPass.length(); ++i) {
            if (!Character.isLetterOrDigit(uPass.charAt(i))) {
                System.out.println("A password must contain only letters and digits");
                return false;
            }
        }
        // atleast 2 digits
        for (int i = 0; i < uPass.length(); ++i) {
            if (Character.isDigit(uPass.charAt(i))) {
                ++counter;
            }
        }
        if (counter <= 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }
        // default
        return true;
    }
}
