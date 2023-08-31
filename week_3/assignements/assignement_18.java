package week_3.assignements;

import java.util.*;
//Write a program that prompts the user to enter the weight of the package and
//display the shipping cost. If the weight is greater than 20, display a message “the
//package cannot be shipped.”

public class assignement_18 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        double wageOfPackage = 0;
        System.out.println("Welcome to Inar Shipping . Please write your name ");
        String nameOfUser = bilal.nextLine();

        System.out.println("Dear " + nameOfUser + " Inar Shipping's transportation wage is at below\n" +
                "3.5$, if your package between 0 and 1 pound\n" +
                "5,5$, if your package between 1 and 3 pound\n" +
                "8.5$, if your package between 3 and 10 pound\n" +
                "10.5$, if your package between 10 and 20 pound\n" +
                "we don't transport the packages more than 20 pounds ");


        System.out.println("Dear " + nameOfUser + " What is the weight of your package in pounds?");
        double weightOfPackage = bilal.nextDouble();

        if (0 < weightOfPackage && weightOfPackage <= 1) wageOfPackage = weightOfPackage * 3.5;
        else if (1 < weightOfPackage && weightOfPackage <= 3) wageOfPackage = weightOfPackage * 5.5;
        else if (3 < weightOfPackage && weightOfPackage <= 10) wageOfPackage = weightOfPackage * 8.5;
        else if (10 < weightOfPackage && weightOfPackage <= 20) wageOfPackage = weightOfPackage * 3.5;
if ( weightOfPackage<=20) System.out.println("Dear "+nameOfUser+" The shipping cost of your package of "+weightOfPackage+ " pounds is " +wageOfPackage);
else System.out.println("Dear "+ nameOfUser+" Inar Shipping don't transport the packages more than 20 pounds ");

    }
}
