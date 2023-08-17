package week_2.assıgnements;
import java.util.*;
//Wr�te a program that changes a g�ven amount of
//money �nto smaller monetary un�ts.

public class assignement_22 {
    public static void main ( String [] args){

        Scanner bilal = new Scanner (System.in);
        System.out.println("please enter the amount of moneyin form of cents");
        int amount = bilal.nextInt();
        System.out.println("you entered "+ amount +" cents ");
        int dollar = amount / 100;
        int remainingAmount = amount % 100;
        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;
        int nickel = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int pennies = remainingAmount;
        System.out.println( amount + " cents consist of \n" +
                dollar + " dollars \n" +
                quarters + " quarters \n" +
                dimes + " dimes \n" +
                nickel + " nickels \n" +
                pennies + " pennies ");





    }
}
