package week_6;

import java.util.Scanner;
//(Sum the digits in an integer) Write a method that computes the sum of the digits
//in an integer. Use the following method header:
public class assignment_2_sum_of_digits_given_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to learn its sum of digits : ");
        long number = input.nextLong();
         numberForExtraction(number);
        System.out.println("Sum of the digits is :"+numberForExtraction(number));
            }


    public static int numberForExtraction(long numberForExtraction){
        int total=0;
        int longOfNumber =Long.toString(numberForExtraction).length();

       for ( int i =longOfNumber ; i >=0; i--){

           int extractedNumber = (int)(numberForExtraction / Math.pow(10,i));
           numberForExtraction %= (long) Math.pow(10,i);
            total +=extractedNumber;
       }
        return total;
    }


}
