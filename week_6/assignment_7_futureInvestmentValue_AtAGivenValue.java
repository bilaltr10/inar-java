package week_6;

import java.util.Scanner;
//Write a method that computes
//future investment value at a given interest rate for a speci�ed number of years. The future
//investment is determined using the formula below.
public class assignment_7_futureInvestmentValue_AtAGivenValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount invested : ");
        double amountInvested = input.nextDouble();
        System.out.print("Annual interesr rate : ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the years : ");
        int year = input.nextInt();

        System.out.printf("%-10s %10s %s", "YEARS", "FUTURE VALUE","\n");
        for (int i = 1; i <= year; i++) {
            double result = futureUnvestmentValue(amountInvested, annualInterestRate, i);

            System.out.printf("%-10d %10.2f %s", i, result, "\n");
        }

    }


    public static double futureUnvestmentValue(double amount, double annualInterestRate, int year) {


        double futureInvestmentValue = amount * Math.pow((1 + annualInterestRate / 1200), year * 12);


        return futureInvestmentValue;
    }

}
