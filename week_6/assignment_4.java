package week_6;

import java.util.Scanner;

public class assignment_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter an number ");
        String numberThatUserEntered = input.next();


        if (isAllDigit(numberThatUserEntered)) {
            System.out.println(reverse(numberThatUserEntered));
        }
        else {
            System.out.println("Invalid value entered (e.g letter or character other than number)");
        }

    }

    public static boolean isAllDigit(String number) {

        for (int i = 0; i < number.length(); i++) {

            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }

        return true;
    }


    public static int reverse(String number) {

        int integerVersionOfNumber = Integer.parseInt(number);
        int reversedNumber = 0;
        int longOfNumber = number.length();
        int extractedNumber = 0;
        int a = 0;
        for (int i = longOfNumber; i >= 0; i--) {

            extractedNumber = (int) (integerVersionOfNumber / Math.pow(10, i));
            integerVersionOfNumber -= (int) (extractedNumber * Math.pow(10, i));
            reversedNumber += (int) (extractedNumber * Math.pow(10, a - 1));
            a++;

        }
        return reversedNumber;

    }

    /*public static int reverse(String number) {
        int integerVersionOfNumber = Integer.parseInt(number);
        int reversedNumber = 0;

        while (integerVersionOfNumber != 0) {
            int digit = integerVersionOfNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            integerVersionOfNumber /= 10;
        }

        return reversedNumber;
    }*/
}


