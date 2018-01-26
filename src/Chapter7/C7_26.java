package Chapter7;

import java.util.*;

/**
 * This program makes two list and compares them
 *
 * @author Darrius Stewart
 */
public class C7_26 {

    /**
     * Main Methods
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2) == true) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Equals method compares the list
     *
     * @param list1 the first list filled with ints
     * @param list2 the second list filled with ints
     * @return true or false
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        return java.util.Arrays.equals(list1, list2);
    }
}
