package week_6;

import java.util.Scanner;
//Create a method named isPrime(int number) that checks if a number is prime. Use this
//method to �nd the number of prime numbers less than 10000.
public class assignment_10_isPrime_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 2; i < 10000; i++) {

            //      System.out.println(i + "    " + isPrime(i));

            if (isPrime(i)) {
                count++;

            }
        }
        System.out.println(count - 1);
    }


    public static boolean isPrime(int number) {

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
