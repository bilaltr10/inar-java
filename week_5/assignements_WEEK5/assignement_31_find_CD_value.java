package week_5.assignements_WEEK5;

import java.util.Scanner;

//and so on.
//Write a program that prompts the user to enter an amount (e.g., 10000), the annual
//percentage yield (e.g., 5.75), and the number of months (e.g., 18) and displays a table as
//shown in the sample run
public class assignement_31_find_CD_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount : ");
        double initialDepositAmount = input.nextInt();
        System.out.print("Enter annual deposit yield : ");
        double annualDepositYield = input.nextDouble();
        System.out.println("Enter maturity period : ");
        int maturityPeriod = input.nextInt();
        double monthlyIncome = 0 ;
        double monthlyDepositYield = annualDepositYield/1200;

        System.out.println("Month ------------CD VALUE");
        for ( int i =0 ; i<maturityPeriod ; i++){

            initialDepositAmount = initialDepositAmount + initialDepositAmount*monthlyDepositYield;



            System.out.printf("%-10d  %15f %s",i,initialDepositAmount,"\n");

        }



    }
}
