package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Compute the greatest common divisor) Find the greatest common divisor of two integers
//n1 and n2 is as follows: First find d to be the minimum of n1 and n2, then check whether d ,
//d-1, d-2, . . . , 2, or 1 is a divisor for both n1 and n2 in this order. The �rst such common
//divisor is the greatest common divisor for n1 and n2. Write a program that prompts the user
//to enter two positive integers and displays the gcd
public class assignement_14_find_common_greatest_divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value_1 = 0;
        int value_2 = 0;
        int min_Of_two_value = 0;
        System.out.print("Enter first integer :");
        value_1 = input.nextInt();

        System.out.print("Enter second integer :");
        value_2 = input.nextInt();

        min_Of_two_value = Math.min(value_1, value_2);


        while (!((value_1 % min_Of_two_value==0) && (value_2% min_Of_two_value==0))){

            min_Of_two_value--;
        }
        System.out.printf("Common greatest common divisor for %d and %d is %d ",value_1,value_2,min_Of_two_value);
    }
}
