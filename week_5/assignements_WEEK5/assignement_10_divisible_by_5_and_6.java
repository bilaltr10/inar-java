package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100
//to 1,000, ten per line, that are divisible by 5 and 6. Numbers are separated by exactly one
//space.
//Output
public class assignement_10_divisible_by_5_and_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int passTodown =0;
        for ( int i =100; i<1000; i++){

            if ( i % 5 ==0 && i%6==0){
                System.out.print(i+" ");
           passTodown++;
            }
            if (passTodown==10){
                System.out.println();
          passTodown=0;
            }

        }


    }
}
