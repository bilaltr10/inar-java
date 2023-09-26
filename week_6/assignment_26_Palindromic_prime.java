package week_6;

import java.util.Scanner;
//A palindromic prime is a prime number and also palindromic. For
//example, 131 is a prime and also a palindromic prime, as are 313 and 757. Write a program
//that displays the �rst 100 palindromic prime numbers. Display 10 numbers per line,
//separated by exactly one space
public class assignment_26_Palindromic_prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int number = 2;
        while (count <= 100) {

            if (isPalindromicPrime(number)) {
                System.out.printf("%-9s ",number);
                count++;

                if (count%10==0)
                    System.out.println(" ");

            }
            number++;


        }

    }

    public static boolean isPalindromicPrime(int number) {

        boolean x = isPalindrom(number);
        boolean y = isPrime(number);
        if (x && y) {
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

    public static boolean isPalindrom(int num) {

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
        return reversedNumber == num;


    }

}
