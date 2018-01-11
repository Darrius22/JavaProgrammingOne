package Chapter4;

import java.util.Scanner;

/**
 * Program displays employee information and payroll statement
 *
 * @author Darrius Stewart
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //Darrius Stewart
        Scanner input = new Scanner(System.in);

        //Gets all the data for Pay Roll
        System.out.println("Enter employee's first and last name>> ");
        String sName = input.nextLine();

        System.out.println("Enter number of hours worked in a week>> ");
        double hoursWorked = input.nextDouble();

        System.out.println("Enter hourly pay rate>> ");
        double payRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate(decimal form)>> ");
        double fedWithhold = input.nextDouble();

        System.out.println("Enter state tax withholding rate(decimal form)>> ");
        double stateWithhold = input.nextDouble();

        System.out.println("Emplyee's name: " + sName);

        System.out.println("Hours Worked: " + hoursWorked);

        System.out.println("Pay Rate: $" + payRate);

        double grossPay = hoursWorked * payRate;
        System.out.println("Gross Pay: $" + grossPay);

        //Shows all the outputs 
        System.out.println("Deductions:");

        double fedPercent = fedWithhold * 100;
        double fedWith = fedWithhold * grossPay;
        System.out.printf("* Federa Withholding (%.2f%%): $%.2f\n", fedPercent, fedWith);

        double statePercent = stateWithhold * 100;
        double stateWith = stateWithhold * grossPay;
        System.out.printf("** State withholding (%.2f%%): $%.2f\n", statePercent, stateWith);

        double totalDeduc = fedWith + stateWith;
        System.out.printf("*** Total Deduction: $%.2f\n", totalDeduc);

        double netPay = grossPay - totalDeduc;
        System.out.printf("**** Net pay: $%.2f\n", netPay);
    }
}
