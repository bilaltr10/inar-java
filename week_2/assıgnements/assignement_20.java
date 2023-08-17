package week_2.assıgnements;
import java.text.DecimalFormat;
import java.util.*;
//Write a program that reads the balance and the annual percentage interest rate and
//displays the interest for the next month.
public class assignement_20 {
    public static void main ( String [] args){
        Scanner bilal = new Scanner ( System.in);
        System.out.println("please enter your balance ");
        double value_customer= bilal.nextDouble();
        DecimalFormat decimal = new DecimalFormat("#,###");
        String value = decimal.format(value_customer);
        System.out.println("Please enter your Annual Interest Rate ");
        double annual_interest_rate = bilal.nextDouble();
        double interest = value_customer*(annual_interest_rate/1200);
        System.out.println("Your interest for next month for "+value+ " $ is " + (int)(interest*10000)/10000.0);
    }
}
