package Chapter7;

import java.util.Scanner;

/**
 * This program gets the grades of students
 *
 * @author Darrius Stewart
 */
public class C7_1 {

    /**
     * Main Method gets the number of student
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students>> ");
        int numStudents = input.nextInt();
        int[] students = new int[numStudents];

        int[] grades = new int[numStudents];

        getNumbers(numStudents, grades);
        highGrade(students, grades);
    }

    /**
     * getNumbers method gets the grades for each student in the array
     *
     * @param numStudents array filled with the amount of students
     * @param grades the corresponding array for each students grades
     */
    public static void getNumbers(int numStudents, int[] grades) {
        Scanner input = new Scanner(System.in);
        //This loops ask for a number as long as x is shorter than length of array
        System.out.println("Enter " + numStudents + " numbers(Press space after each number)>> ");
        for (int x = 0; x < grades.length; ++x) {
            grades[x] = input.nextInt();
        }
    }

    /**
     * highGrade method takes all the students grades and displays the student
     * with the highest grade
     *
     * @param students arrays filled with the students
     * @param grades array filled with the grades of the students
     */
    public static void highGrade(int[] students, int[] grades) {
        //this for loop gets the biggest grade inputed
        int num = 0;
        int highGrade = 0;
        int best = 0;
        for (int x = 0; x < grades.length; ++x) {
            if (grades[x] > num) {
                highGrade = grades[x];
                num = grades[x];
            }
            best = highGrade;
        }

        //This for loop gets what grade each student gets
        //System.out.println(best);
        for (int x = 0; x < grades.length; ++x) {
            if (grades[x] >= (best - 10)) {
                System.out.println("Student " + students[x] + " score is " + grades[x] + " and grade is A");
            } else if (grades[x] >= (best - 20)) {
                System.out.println("Student " + students[x] + " score is " + grades[x] + " and grade is B");
            } else if (grades[x] >= (best - 30)) {
                System.out.println("Student " + students[x] + " score is " + grades[x] + " and grade is C");
            } else if (grades[x] >= (best - 40)) {
                System.out.println("Student " + students[x] + " score is " + grades[x] + " and grade is D");
            } else {
                System.out.println("Student " + students[x] + " score is " + grades[x] + " and grade is F");
            }
        }
    }
}
