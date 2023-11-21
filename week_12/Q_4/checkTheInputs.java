package week_12.Q_4;

import week_11.Q_1.Q_6.Loan;

import java.util.Scanner;

public class checkTheInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter the AnnualInterestRate, Years ,  Amount");

        try {
            week_12.Q_4.Loan loan = new week_12.Q_4.Loan(input.nextDouble(), input.nextInt(), input.nextDouble());

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage() );
        }


    }
}


