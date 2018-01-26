package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program gets the average of array
 *
 * @author Darrius Stewart
 */
public class P7 {

    /**
     * Main method initiates size of array and displays the average
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Darrius stewart 
        Scanner input = new Scanner(System.in);

        //gets the array size
        System.out.println("How many numbers will the program need to read? ");
        int arraySize = input.nextInt();
        int[] number = new int[arraySize];

        //makes the array
        getNumbers(arraySize, number);
        System.out.printf("The average of the array is %.2f\n", average(number));
        /*for (int x = 0; x <= number.length; ++x) {
            System.out.print(number[x] + ", ");
        }*/
        System.out.println(Arrays.toString(number));
    }

    /**
     * getNumbers method gets the numbers to put into array
     *
     * @param arraySize size of the array
     * @param number array filled with the numbers
     */
    public static void getNumbers(int arraySize, int[] number) {
        Scanner input = new Scanner(System.in);
        //This loops ask for a number as long as x is shorter than length of array
        System.out.println("Enter " + arraySize + " numbers(Press space after each number)>> ");
        // int number = new int[5];
        for (int x = 0; x < number.length; ++x) {
            number[x] = input.nextInt();
        }
    }

    /**
     * average method finds the average of numbers array
     *
     * @param number array of the numbers
     * @return average of the array
     */
    public static double average(int number[]) {
        //loop that goes as long as the array
        double sum = 0;
        double num1 = 0;
        for (int x = 0; x < number.length; ++x) {
            sum = num1 + number[x];

            num1 = sum;
        }

        //gets the average of the array
        double average = sum / number.length;
        return average;
    }
}
