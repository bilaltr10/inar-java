package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_6_findPrimes {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = findPrimes();
         showArrayOfPrimes(array);
    }

    public static int[] findPrimes() {

        int number = 3;
        int indis = 1;
        int[] primes = new int[50];
        primes[0] = 2;

        while (indis < primes.length) {

            if (isPrime(number, primes)) {
                primes[indis] = number;
                indis++;
            }
            number++;

        }
        return primes;
    }

    public static boolean isPrime(int number, int[] primes) {

        for (int i = 0; primes[i] <= (int) (Math.sqrt(number)); i++) {
            if (number % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showArrayOfPrimes(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d", array[i]);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }

        }
    }

}

