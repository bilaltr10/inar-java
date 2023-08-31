package week_3.assignements;

import java.util.*;
//Write a program that prompts the user to enter a three-digit
//integer and determines whether it is a palindrome number

public class assignement_12 {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter a three-digit integer : ");
        int number = bilal.nextInt();

        int x = number % 10;
        x = x * 100;
        int y = ((number / 10) % 10) * 10;
        int c = number % (x + y);
        int reversedNumber = x + y + c;


        String ısReversedNumber = reversedNumber == number ? (number + " is a palindrom ") : (number + " is not a palindrome");
        System.out.println(ısReversedNumber);


    }


}

