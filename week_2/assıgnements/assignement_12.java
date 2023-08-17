package week_2.assıgnements;

import java.util.*;

public class assignement_12 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter the speed of airplane in form of m/s");
        double ms_sec = bilal.nextDouble();
        System.out.println("enter acceleration value in form of m/s2");
        double acceleration = bilal.nextDouble();
        System.out.println("The minimum runway lenght for this plane is " + (Math.pow(ms_sec, 2)) / (2 * acceleration));
    }


}
/*(Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v,
you can compute the minimum runway length needed for an airplane to take off using the
following formula:
length =
𝑣
2
2𝑎
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2 ), and displays the minimum runway length*/