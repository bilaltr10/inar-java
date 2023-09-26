package week_6;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_12_Display_characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the first char : ");
        char firstChar = input.next().charAt(0);
        System.out.println("Write the last char : ");
        char lastChar = input.next().charAt(0);
        System.out.println("How many char per line : ");
        int numberOfCharsPerLine = input.nextInt();

        printChars(firstChar,lastChar,numberOfCharsPerLine);

    }
    public static void printChars(char ch1 , char ch2 ,int num){
int count =0 ;

      if ( ch1<ch2){
          for ( int i = ch1; i<=ch2 ; i++){

              System.out.print((char)(i)+" ");
              count++;

              if (count %num ==0){
                  System.out.println();
              }
          }

      }
      else {
          for ( int i = ch1; i>=ch2 ; i--){

              System.out.print((char)(i)+" ");
              count++;

              if (count %num ==0){
                  System.out.println();
              }
          }
      }
    }


}
