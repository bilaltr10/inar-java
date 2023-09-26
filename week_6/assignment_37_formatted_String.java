package week_6;

import java.util.Scanner;
//The method returns a string for the number with one or more pre�x 0s. The size of the
//string is the width. For example, format(34, 4) returns 0034 and format( 34, 5) returns
//00034. If the number is longer than the width, the method returns the string representation
//for the number. For example, format(34, 1) returns 34
public class assignment_37_formatted_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("Enter the width : ");
        int width = input.nextInt();

        System.out.printf("%d %s %d : %s",number," formatted to width ", width,checkTheNumber(number,width) );
    }

    public static String checkTheNumber(int number , int width){

        String x = number + "";
        int lengthOfNumber = x.length();
        if ( lengthOfNumber>=width){
          return  formatNumberMoreThanLength(number);
        }
        else {
         return   formatNumberLessThanLength(number,width);
        }

    }

    public static String formatNumberMoreThanLength(int number){
        return number+"";

    }

    public static String formatNumberLessThanLength(int number , int width){
        String x = number + "";
        String newFormatNumber = "";
        int lengthOfNumber = x.length();

        int numberOfZero = width-lengthOfNumber;

        for (int i =0; i<numberOfZero; i++){

            newFormatNumber +=0;
        }


        return newFormatNumber+number;
    }
}
