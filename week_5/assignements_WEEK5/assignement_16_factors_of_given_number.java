package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Find the factors of an integer) Write a program that reads an integer and displays
//all its smallest factors in increasing order. For example, if the input integer is
//120, the output should be as follows: 2, 2, 2, 3, 5
public class assignement_16_factors_of_given_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter an integer ");
        int valueEntered = input.nextInt();
        String divisors = "";

        int value_entered = valueEntered;
        for (int i = 2; i <value_entered/2; i++) {

            while (valueEntered % i == 0 && valueEntered!=1) {

                valueEntered = valueEntered/i;
                divisors += i + " ";

            }

        }
        if (divisors.equals("")) {
            System.out.println("Sayı asal sayıdır sadece 1 e ve kendisine bölünür ");
        } else {
            System.out.println(divisors);
        }


    }
}
