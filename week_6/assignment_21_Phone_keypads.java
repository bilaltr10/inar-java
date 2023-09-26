package week_6;

import java.util.Scanner;
//Write a test program that prompts the user to enter a phone number as a string. The input
//number may contain letters. The program translates a letter (uppercase or lowercase) to a
//digit and leaves all other characters intact. Here is a sample run of the program:
public class assignment_21_Phone_keypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string ");
        String str = input.next().toUpperCase();
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {

                int number = getNumbers(str.charAt(i));
                System.out.print(number);
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }

   public static int getNumbers(char ch) {
        int number = 1;

        if (ch >= '0' && ch <= '9') {
            return ch - '0';

        } else if (ch >= 'A' && ch <= 'Z') {
            for (int i = (int) ('A'); i <= (int) (ch); ) {

                if ((ch >'O' && ch <='S')|| (ch>'V'&&ch<'Z') ) {
                    i += 4;
                    number++;


                } else {
                    i += 3;
                    number++;

                }
            }
        }

        return number;
    }
 /* public static int getNumbers(char ch) {
      if (ch >= '0' && ch <= '9') {
          return ch - '0';
      } else if (ch >= 'A' && ch <= 'Z') {
          int base = (ch > 'O' && ch <= 'S') || (ch > 'V' && ch <= 'Z') ? 'O' : 'A';
          int step = (base == 'O') ? 4 : 3;
          return 1 + (ch - base) / step;
      } else {
          // Handle other characters or return a default value.
          return -1; // You can choose an appropriate default value here.
      }
  }*/

}