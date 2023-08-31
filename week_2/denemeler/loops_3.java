package week_2.denemeler;
import  java.util.*;
public class loops_3 {
   //Write a Java program to find the nth Fibonacci number using a do-while loop.
    public static void main ( String [] args) {
        Scanner bilal = new Scanner ( System.in );
        System.out.println("write a number to find its corresonpende of fibonachi array ");

        int sayı = bilal.nextInt();
        int prev1 = 1;
        int prev2 = 1;
        int fibN = 0;
        int i = 3;

        do {
            fibN = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibN;
            i++;
        } while (i <= sayı);
        System.out.println(fibN);


// ben bunu çözemedim ;((



    }
}
