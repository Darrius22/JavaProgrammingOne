package Chapter4;

import java.util.Scanner;

/**
 * Program displays major and status represented by inputed characters
 *
 * @author Darrius Stewart
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Darrius Stewart
        Scanner input = new Scanner(System.in);

        //List the options
        /*System.out.println("Majors");
		System.out.println("M: Mathmathetics");
		System.out.println("C: Computer Science");
		System.out.println("I: Information Technology");
		
		System.out.println("Grades");
		System.out.println("1: Freshman");
		System.out.println("2: Sophmore");
		System.out.println("3: Junior");
		System.out.println("4: Seniors");*/
        //Gets users input of the two characters
        System.out.println("First entry is a Letter. Second entry is a number");
        System.out.println("Enter two characters>> ");
        String userInput = input.nextLine();

        //Puts the input into the individual variables
        char major = userInput.charAt(0);
        major = Character.toUpperCase(major);
        char grade = userInput.charAt(1);

        String sMajor = null;
        String sGrade = null;
        if (major == 'M') {
            sMajor = "Mathamatics";
        } else if (major == 'C') {
            sMajor = "Computer Science";
        } else if (major == 'I') {
            sMajor = "Inforamtion Technology)";
        } else {
            System.out.println("Invailid Output");
            System.exit(0);
        }
        if (grade == '1') {
            sGrade = "Freshman";
        } else if (grade == '2') {
            sGrade = "Sophmore";
        } else if (grade == '3') {
            sGrade = "Junior";
        } else if (grade == '4') {
            sGrade = "Senior";
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println(sMajor + " " + sGrade);
    }
}
