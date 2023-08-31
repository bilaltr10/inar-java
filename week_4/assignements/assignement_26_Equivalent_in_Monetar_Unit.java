package week_4.assignements;

import java.util.*;

//Write a Java program that prompts the user to enter an amount in dollars and cents (Read
//the input as a string such as "11.56") and then converts and displays the equivalent amount
//in smaller monetary units. The program should display the number of dollars, quarters,
//dimes, nickels, and pennies that make up the total amount. Consider using the following
//conversion factors:
public class assignement_26_Equivalent_in_Monetar_Unit {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter the amount of money (XX,XX) FORMAT");
        String amountOfMoney = bilal.next();

        int k = amountOfMoney.indexOf(',');
        int x1 = Integer.parseInt(amountOfMoney.substring(0, k));
        int y1 = Integer.parseInt(amountOfMoney.substring(k + 1));


        int quarters = y1 / 25;
        int remaimingAmount = y1 % 25;
        int dimes = remaimingAmount / 10;
        remaimingAmount %= 10;
        int nickels = remaimingAmount / 5;
        remaimingAmount %= 5;
        int pennies = remaimingAmount;

        System.out.println("Equivalent in Monetary Units :\n" +
                "Dollars : " + x1 + "\n" +
                "Quarters : " + quarters + " \n" +
                "Dimes : " + dimes + "\n" +
                "Nickels : " + nickels + "\n" +
                "Pennies : " + pennies);
    }
}
