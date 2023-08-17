package week_2.assıgnements;

import java.util.*;

public class assignement_23 {
    //Write a program that prompts the user to enter the distance to
    //drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
    //and displays the cost of the trip. H
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        String yes ;

        do{
           System.out.println("Enter the driving distance ");

        double drivingDistance = bilal.nextDouble();
        System.out.println("Enter miles per gallon");
        double milesPerGallon = bilal.nextDouble();
        System.out.println("Enter price per gallon ");
        double pricePerGallon = bilal.nextDouble();
        double totalPrice = (drivingDistance/milesPerGallon)*pricePerGallon;
        System.out.println("your total price for "+ drivingDistance+ " miles : "+ (int)(totalPrice*100)/100.0+ " $");
        System.out.println("please type yes if you want to look for another distance");
        yes = bilal.next();
       } while (yes.equals("yes"));
        System.out.println("THANK YOU FOR USING OUR APP");

    }
}
