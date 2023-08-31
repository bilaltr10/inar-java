package week_3.assignements;

import java.util.*;
//Write a program that reads three edges for
//a triangle and computes the perimeter if the input is valid. Otherwise, display that
//the input is invalid. The input is valid if the sum of every pair of two edges is
//greater than the remaining edge


public class assignement_19 {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.print("Write the egdes of triangle \n");
        System.out.println("A : ");
        a = bilal.nextInt();
        System.out.println("B : ");
        b = bilal.nextInt();
        System.out.println("C : ");
        c = bilal.nextInt();

boolean valid  = ((a+b >= c ) && (a+c >= b) && ( c+b >= a ));
            if (valid){
                System.out.println("Perimeter of triangle is : " + (a+b+c));

            }
            else {
                System.out.println("The input is invalid.");
            }
     }
}
