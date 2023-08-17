package week_2.assıgnements;

import java.util.*;

//(Financial application: calculate future investment value) Write a program that
//reads in investment amount, annual interest rate, and number of years, and displays
//the future investment value using the following formula:
public class assignement_21 {
    public static void main(String[] args) {

        Scanner bilal =  new Scanner(System.in);
        double InvestmentAmount, AnnualInterestRate, MonthlyInterestRate, futureInvestmentValue;

        System.out.println("Enter ınvestment amount ");
        InvestmentAmount = bilal.nextDouble();
        System.out.println("Enter Annual Interest Rate ");
        AnnualInterestRate = bilal.nextDouble();
        MonthlyInterestRate = AnnualInterestRate/12.0 ;
        System.out.println(MonthlyInterestRate);
        System.out.println("Enter Number Of Years You will Keep Your Investment");
        int year = bilal.nextInt();

        futureInvestmentValue = (InvestmentAmount )+ Math.pow((1+MonthlyInterestRate),year*12);
        System.out.println(year +" Years later Your "+ InvestmentAmount+ " $ with the "+ AnnualInterestRate + " of interest rate will be "+
             futureInvestmentValue   );



    }
}
