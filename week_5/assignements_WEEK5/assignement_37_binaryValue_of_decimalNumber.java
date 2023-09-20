package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Decimal to binary) Write a program that prompts the user to enter a decimal integer and
//displays its corresponding binary value. Don’t use Java’s Integer .toBinaryString(int) in
//this program
public class assignement_37_binaryValue_of_decimalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputUserEntered = input.nextInt();
        int i = 0;
        String binaryValue = "";
        while (Math.pow(2, i) < inputUserEntered) {
            i++;
        }
        i--;
        System.out.println(i);
        while (i >= 0) {

            if ( (int) (Math.pow(2, i)) <=inputUserEntered) {
                binaryValue += 1 + "";
                inputUserEntered -=(int) (Math.pow(2, i));

            }
            else {
        binaryValue +=0+"";
            }

            i--;
        }
        System.out.println(binaryValue);

    }
}
