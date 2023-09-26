package week_6;

import java.util.Scanner;
//An emirp (prime spelled backward) is a nonpalindromic prime number whose
//reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps.
//Write a program that displays the �rst 100 emirps. Display 10 numbers per line, separated
//by exactly one space, as follows
public class assignment_27_emirp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int number = 10;
        while (count < 100) {

            if (isPalindromicPrime(number)) {
                System.out.printf("%-10d",number);
                count++;

                if (count % 10 == 0) {
                    System.out.println(" ");
                }
            }
            number++;

        }

    }

    public static boolean isPalindromicPrime(int number) {

        int x = palindrom(number);
        boolean y = isPrime(number);
        boolean z = isPrime(x);
        if (z && y) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int palindrom(int num) {

        String number = num + "";
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
        if (reversedNumber != num) {
            return reversedNumber;
        }
        return 6;

    }

}



