package week_5.assignements_WEEK5;

import java.util.Scanner;

//Write a program that prompts the user to enter an amount (e.g., 100), the annual interest
//rate (e.g., 5), and the number of months (e.g., 6) and displays the amount in the savings
//account after the given month.
public class assignement_30_monthly_savings_put_same_money_every_month_its_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount :");
        double input_amount = input.nextDouble();

        System.out.print("Enter annual interest rate :");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of months :");
        int numberOfMonths = input.nextInt();
        double monthyInterestRate = annualInterestRate / 1200;
        double totalAmount = 1;

        for (int i = 0; i < numberOfMonths; i++) {

            totalAmount += input_amount+((totalAmount + input_amount )* monthyInterestRate);

        }
        System.out.println("Amount in savings account after " + numberOfMonths + " months : " + totalAmount);


    }
}
