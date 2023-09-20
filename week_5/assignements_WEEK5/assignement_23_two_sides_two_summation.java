package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Financial application: loan amortization schedule) The monthly payment for a given loan
//pays the principal and the interest. The monthly interest is computed by multiplying the
//monthly interest rate and the balance (the remaining principal). The principal paid for the
//month is therefore the monthly payment minus the monthly interest. Write a program that
//lets the user enter the loan amount,number of years, and interest rate and displays the
//amortization schedule for the loan.
public class assignement_23_two_sides_two_summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
double total_other_side = 0;
        for ( int i = 50000 ; i>=1 ; i--){

      total+= (1.0/i );


}
        System.out.printf("%s %.15f","Summation of right to left :",total);
        System.out.println();

        for ( int i =1; i<=50000 ; i++){
            total_other_side +=1.0/i;

        }
        System.out.printf("%s %.15f","Summation of series left to right :",total_other_side);
        System.out.println();
        System.out.printf("%s %.15f","(Left to right )- (Right to left) = ",total_other_side-total);

    }
}
