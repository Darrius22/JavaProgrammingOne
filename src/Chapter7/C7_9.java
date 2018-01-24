package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program finds the smallest element in an array
 *
 * @author Darrius Stewart
 */
public class C7_9 {

    /**
     * Main Method gets the array of numbers
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        //This loops ask for a number as long as x is shorter than length of array
        System.out.println("Enter 10 numbers(Press space after each number)>> ");
        for (int x = 0; x < numbers.length; ++x) {
            numbers[x] = input.nextDouble();
        }
        Arrays.sort(numbers);
        double[] number = new double[10];
        System.arraycopy(numbers, 0, number, 0, numbers.length);
        //System.out.println(Arrays.toString(number));

        min(numbers);
        //double low = 0.0; 
        //System.out.println("The minimum number is " + min(low , numbers));
    }

    /**
     * min Method finds the lowest number in the array
     *
     * @param number the array of numbers
     */
    public static void min(double[] number) {

        int indexOf = 0;
        double num = 0;
        double lowGrade = number[0];
        for (int x = 1; x < number.length; ++x) {
            //num = number[x]; 
            if (number[x] < num) {
                lowGrade = number[x];
                indexOf = x;
            }
            //else {
            //   num = number[x];
            // }
            // low = lowGrade;
        }
        //return low; 
        System.out.println("The minimum number is " + lowGrade);
    }
}
