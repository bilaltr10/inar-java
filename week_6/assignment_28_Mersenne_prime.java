package week_6;

import java.util.Scanner;
//A prime number is called a Mersenne prime if it can be written in the form
//2 - 1 for some positive integer p. Write a program that �nds all Mersenne primes with p ≤ 31 𝑝
//and displays the output as follows
public class assignment_28_Mersenne_prime {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberEntered = firstEntrance();
        writingsOnTheTop();

        primesUntilTheNumberUserEntered(numberEntered);

      /*
       int i = 2;
       while (i <= numberEntered) {
            if (isPrime(i)) {
                System.out.printf("%-10d %-10d %n", i, mersennePrime(i));
            }
            i++;
        }*/

    }

    public static int firstEntrance() {
        System.out.println("Enter your number to learn mersenne prime");
        return input.nextInt();

    }

    public static void writingsOnTheTop() {
        System.out.println("p                  2^p-1");
        System.out.println("-------------------------");

    }

    public static void primesUntilTheNumberUserEntered(int num) {
        boolean isPrime = true;
        for (int m = 2; m <= num; m++) {
            isPrime = true;
            for (int i = 2; i < m; i++) {

                if (m % i == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                System.out.printf("%-10d %-10d %n", m, mersennePrime(m));
            }
        }

    }
    public static int mersennePrime(int m) {
        return ((int) (Math.pow(2, m))) - 1;
    }



    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

}
