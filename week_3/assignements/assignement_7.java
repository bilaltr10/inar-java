package week_3.assignements;
//Develop a program that changes a given amount of money into smaller monetary units.
//Use singular words for single units such as 1 dollar and 1 penny,
//and plural words for more than one unit such as 2 dollars and 3 pennies
import java.util.*;

public class assignement_7 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        int dollars, quarters, dimes, nickels, pennies, remainingAmount;
        String dollar, quarter, dime, nickel, penny;
        System.out.println("Please enter an amount as a double value representing a total in\n" +
                "dollars and cents");
        double totalAmount = bilal.nextDouble();
        int centAmount = (int) (totalAmount * 100);

        dollars = centAmount / 100;
        dollar= dollars > 1 ? "dollars " : "dollar ";
        remainingAmount = centAmount % 100;
        quarters = remainingAmount / 25;
        quarter = quarters > 1 ? " quarters " : " quarter ";
        remainingAmount = remainingAmount % 25;
        dimes = remainingAmount / 10;
        dime = dimes > 1 ? " dimes " : " dime ";
        remainingAmount = remainingAmount % 10;
        nickels = remainingAmount / 5;
        nickel = nickels > 1 ? " nickels" : " nickel ";
        pennies = remainingAmount % 5;
        penny = pennies > 1 ? "pennies " : "penny ";
        System.out.println("you entered " + totalAmount + " dollars and it consist of \n" +
                dollars + "  " + dollar + "\n" +
                quarters +"  " + quarter + "\n" +
                dimes +   "  " + dime + "\n" +
                nickels + "  " + nickel + "\n" +
                pennies + "   " + penny);

    }
}
