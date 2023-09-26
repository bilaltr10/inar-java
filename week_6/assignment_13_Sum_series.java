package week_6;

import java.util.Scanner;
//Write a method to compute the following series
public class assignment_13_Sum_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter starting and last point ");
        int start = input.nextInt();
        int last = input.nextInt();
        System.out.println("i----------------m(i)");
        for (int i = start ; i <=last; i++) {
           System.out.printf("%-10d %10.2f %s",i,summation(i),"\n");
       }

    }

    public static double summation(int number ){
        double result=0;

        for ( int i =1 ; i<=number; i++){

            result +=i*1.0/(i+1);
        }

        return result;
    }
}

