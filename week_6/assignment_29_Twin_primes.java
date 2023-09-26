package week_6;

import java.util.Scanner;
//Twin primes are a pair of prime numbers that differ by 2. For example,
//3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
//Write a program to �nd all twin primes less than 1,000. Display the output as follows
public class assignment_29_Twin_primes {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = num1 + 2;
        int z = 1000;

        while (num1 <= z) {

            if (isPrimeNum1(num1) && isPrimeNum2(num2)) {
                System.out.printf("%-10d %-10d %n", num1, num2);
            }
            num1++;
            num2 = num1 + 2;

        }
    }

    public static boolean isPrimeNum1(int num1) {

        boolean checkNum1 = true;

        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                checkNum1 = false;
                break;
            }
        }
        return checkNum1;
    }

    public static boolean isPrimeNum2(int num2) {
        boolean checkNum2 = true;

        for (int i = 2; i < num2; i++) {
            if (num2 % i == 0) {
                checkNum2 = false;
                break;
            }

        }
        return checkNum2;
    }
}
