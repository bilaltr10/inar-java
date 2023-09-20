package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Financial application: compare loans with various interest rates) Write a program that lets
//the user enter the loan amount and loan period in number of years and displays the
//monthly and total payments for each interest rate starting from 5% to 8%, with an
//increment of 1/8.
public class assignement_21_different_Inteerest_rate_total_and_monthly_payment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount : ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the number of years :");
        int numberOfYears = input.nextInt();

        System.out.printf("%s %10s %10s","Interest Rate ", " Monthly Payment ", "Total Payment");
        System.out.println("");
        for (double interestRate = 5.000;interestRate<=8 ; interestRate += 0.125   ){

            double monthlyInterestRate =interestRate / 1200 ;
            double montlyPayment= ((loanAmount*monthlyInterestRate )/(1 - (1.0/(Math.pow(1+monthlyInterestRate,numberOfYears*12)))));

double totalPatment = montlyPayment * numberOfYears * 12 ;
            System.out.printf("%.3f %s   %15.2f   %15.2f",interestRate,"%",montlyPayment,totalPatment);
            System.out.println("");



        }

    }
}
