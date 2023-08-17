package week_2.assıgnements;

import java.util.*;

// Write a program that prompts the user to enter the
//side of a hexagon and displays its area
public class assignement_16 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("Enter the side of an hexogan ");
        double side_of_hexogan = bilal.nextDouble();
        System.out.println("The area of hexogan with the side of " + side_of_hexogan + " is : " +
                ((3 * Math.cbrt(3) / 2)) * (Math.pow(side_of_hexogan, 2)));


    }
}
