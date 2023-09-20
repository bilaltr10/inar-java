package week_5.assignements_WEEK5;

import java.util.Scanner;

//) Write a program that prompts the user to enter a decimal integer and
//displays its corresponding octal value. Don’t use Java’s Integer .toOctalString(int) in this
//program.
public class assignement_38_octalValue_of_decimalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer :");
        int decimalInteger = input.nextInt();
        String number = "";
        int kalan = 0;

        while (decimalInteger >=0) {
            if (decimalInteger >= 8) {
                kalan = decimalInteger / 8;
                number += kalan;
                decimalInteger %= 8;
            } else {
                kalan = decimalInteger % 8;
                number += kalan;
                decimalInteger %= 8;
           break;
            }
        }
        System.out.println(number);
    }
}
