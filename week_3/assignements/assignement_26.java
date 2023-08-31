package week_3.assignements;

import java.util.*;
//(Use the &&, || and ^ operators) Write a program that prompts the user to enter
//an integer and determines whether it is divisible by 5 and 6, whether it is divisible
//by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
//of this program

public class assignement_26 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("write an integer ");
        int value = bilal.nextInt();
        System.out.println("enter a value as a first divider ");
        int dividerFirst = bilal.nextInt();
        System.out.println("enter a value as a first divider ");
        int dividerSecond = bilal.nextInt();

        System.out.println("Is " + value + " divisible by " + dividerFirst + " and  " + dividerSecond +"  --->" + (value % dividerFirst == 0 && value % dividerSecond == 0));
        System.out.println("Is " + value + " divisible by " + dividerFirst + " or  " + dividerSecond +"  --->" + (value % dividerFirst == 0 || value % dividerSecond == 0));
        System.out.println("Is " + value + " divisible by " + dividerFirst + " or  " + dividerSecond + " but not both "+"  --->" + (value % dividerFirst == 0 ^ value % dividerSecond == 0));

    }
}
