package week_2.denemeler;

import java.util.*;

public class loops_13 {
    //Write a Java program to find the reverse of a number and check if it's a palindrome
    // (reads the same forwards and backwards).
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {  //şu işlem güzel
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        scanner.close();

    }
}


       /* String writtenNumber = number + "";

        char[] array = new char[writtenNumber.length()];
        array = writtenNumber.toCharArray();
        char[] array_2 = new char[writtenNumber.length()];
        array_2 = writtenNumber.toCharArray();
        for (int i = writtenNumber.length() - 1; i >= 0; i--) {

            System.out.print(array[i] + "  ");

        }
        System.out.println();
        for (int i = 0; i <= writtenNumber.length() - 1; i++) {

            System.out.print(array_2[i] + "2456");
        }

        if (Arrays.equals(array, array_2)) {
            System.out.println("Arrays are the same.");
        } else {
            System.out.println("Arrays are different.");
        }

    }
}*/
