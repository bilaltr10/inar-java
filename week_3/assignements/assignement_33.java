package week_3.assignements;

import java.util.*;
//(Financial: compare costs) Suppose you shop for rice in two different packages.
//You would like to write a program to compare the cost. The program prompts the
//user to enter the weight and price of the each package and displays the one with
//the better price.


public class assignement_33 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("enter weight of first package ");
        double weightOfFirstPackage = bilal.nextDouble();
        System.out.println("Enter price of first package ");
        double priceOffirstPackage = bilal.nextDouble();
        System.out.println("Enter weight Of second package ");
        double weightOfSecondPackage = bilal.nextDouble();
        System.out.println("Enter the price of second package");
        double priceOfSecondPackage = bilal.nextDouble();
if(weightOfFirstPackage/priceOffirstPackage == weightOfSecondPackage/priceOfSecondPackage){
    System.out.println("Two packages have the same price ");
}
       else{
           String advantagedPackage = ( weightOfFirstPackage/priceOffirstPackage > weightOfSecondPackage/priceOfSecondPackage)?
                "Package 1 has a better price  " : "Package 2 has a better price ";
        System.out.println(advantagedPackage);
       }
    }
}