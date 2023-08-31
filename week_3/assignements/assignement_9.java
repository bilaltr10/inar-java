package week_3.assignements;

import java.util.*;
import java.lang.*;

//Write a program that prompts the user to enter the �rst 9 digits and
//displays the 10-digit ISBN (including leading zeros). Your program should read
//the input as an integer.
public class assignement_9 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        int checkSum = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }

        for (int i = 0; i < array.length; i++) {
            checkSum += (array[i] * i);
        }

        int m = checkSum % 11;

        if (m != 10) {
            array[array.length - 1] = m;

            System.out.print("The ISBN -10 number is --> ");
            for (Object a : array) {
                System.out.print(a + "  ");
            }
        } else {
            array[array.length - 1] = m;

            System.out.print("The ISBN -10 number is --> ");
            for (int a : array) {
               if (a <=8 )
                System.out.print(a + "  ");
            }
            System.out.print(m+"(X)");


        }
    }
}
