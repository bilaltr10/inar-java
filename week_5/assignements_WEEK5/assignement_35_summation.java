package week_5.assignements_WEEK5;

import java.util.Scanner;
//Write a program to compute the following summation.

public class assignement_35_summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = 1;

        double total = 0;
        int lastNumber = input.nextInt();


        while (start <= lastNumber) {
            total += 1.0 /( Math.sqrt(start) + Math.sqrt(start + 1));
            start++;

        }
        System.out.println("The sum of the serie is "+ total);
    }
}
