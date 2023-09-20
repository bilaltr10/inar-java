package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Display prime numbers between 2 and 1,000) Write a program to display all the prime
//numbers between 2 and 1,000, inclusive. Display eight prime numbers per line. Numbers are
//separated by exactly one space.
public class assignement_20_odd_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int toTheDown = 0;

        for ( int i =0 ; i<=1000 ; i++){

            if (i % 2 !=0){
                System.out.printf("%-5d %s",i," ");


                toTheDown++;
                if ( toTheDown==8)   {
                 System.out.println();
             toTheDown=0;
                }
            }

        }
    }
}
