package week_4.assignements;

import java.util.*;
//(Financial application: payroll) Write a program that reads the following infor- mation and
//prints a payroll statement:
//Employee’s name (e.g., Smith)
//Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
//Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g., 9%

public class assignement_23_With_Methods {

    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        employesName();
    }
    public static void employesName() {
        Scanner bilal = new Scanner(System.in);
        System.out.print("Enter employee's name :");
        String nameAndSurname = bilal.nextLine();
        hoursWorked();
        System.out.println("Employee's name and surname " + nameAndSurname.toUpperCase());
    }
    public static void hoursWorked() {
        Scanner bilal = new Scanner(System.in);
        System.out.print("Enter number of hours worked in a week ");
        double numberOfHoursPerWeek = bilal.nextDouble();
        HourlyPayRate(numberOfHoursPerWeek);
        System.out.println("Number of hours worked in a week :" + numberOfHoursPerWeek);
    }
    public static void HourlyPayRate(double numberOfHoursPerWeek) {
        Scanner bilal = new Scanner(System.in);
        System.out.print("Enter hourly pay rate :");
        double hourlyPayRate = bilal.nextDouble();
        taxRates(numberOfHoursPerWeek, hourlyPayRate);
        System.out.println("Hourly pay rate :" + hourlyPayRate);
    }
    public static void taxRates(double numberOfHoursPerWeek, double hourlyPayRate) {
        Scanner bilal = new Scanner(System.in);
        System.out.print("Enter federal tax withholding rate :");
        double federalTax = bilal.nextDouble();
        System.out.print("Enter state tax withholding rate :");
        double stateTax = bilal.nextDouble();
        grossPay(numberOfHoursPerWeek, hourlyPayRate, federalTax, stateTax);
    }
    public static void grossPay(double numberOfHoursPerWeek, double hourlyPayRate, double federalTax, double stateTax) {
        System.out.println("Gross pay : " + numberOfHoursPerWeek * hourlyPayRate);
        deduction(numberOfHoursPerWeek * hourlyPayRate, federalTax, stateTax);
    }
    public static void deduction(double grossPay, double federalTax, double stateTax) {
        System.out.println("Dedections :");
        System.out.printf("Federal Withholding : (%.2f ) : %.2f\n", (federalTax * 100), (grossPay * (federalTax * 100)) / 100.0);
        System.out.printf("State Withholding : ( %.2f ) : %.2f\n", (stateTax * 100), (grossPay * (stateTax * 100)) / 100);
        System.out.printf("Total deduction : %.2f\n", (grossPay * (federalTax * 100)) / 100.0 + (stateTax * 100), (grossPay * (stateTax * 100)) / 100);
        netPay(grossPay, ((grossPay * (federalTax * 100)) / 100.0) + (grossPay * (stateTax * 100)) / 100);
    }
    public static void netPay(double grosspay, double netpay) {
        System.out.println("Net pay : $" + (grosspay - netpay));
    }
}
