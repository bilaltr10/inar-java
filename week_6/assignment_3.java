package week_6;

import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();

        System.out.print(number + " is ");

        write(isPalindrome(number));
    }


    public static int reverse(int number) {
        int longOfNumber = Integer.toString(number).length();
        int newnumber = 0;
        int extractedNumber = 0;
        int a = 0;
        for (int i = longOfNumber; i >= 0; i--) {

            extractedNumber = (int) (number / Math.pow(10, i));
            number -= (int) (extractedNumber * Math.pow(10, i));
            newnumber += (int) (extractedNumber * Math.pow(10, a - 1));
            a++;

        }

        return newnumber;
    }

    public static boolean isPalindrome(int number) {

        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }

    }

    public static void write(boolean x) {
        if (x) {
            System.out.print("palindrom");
        } else {
            System.out.print("not palindrom");
        }
    }
}
