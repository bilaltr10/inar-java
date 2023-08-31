package week_2.denemeler;

import java.util.*;

//Write a Java program to find the greatest common divisor (GCD) of two numbers using a recursive function.
public class loops_5 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b,  a%b);

        }


    }
}
