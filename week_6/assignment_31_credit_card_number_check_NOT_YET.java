package week_6;

import java.util.Scanner;

public class assignment_31_credit_card_number_check_NOT_YET {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer");
        long creditCardNumber = input.nextLong();

        getPrefix(creditCardNumber, 16);


        if (isValid(creditCardNumber)) {

            System.out.println(creditCardNumber + " is valid");
        } else {
            System.out.println(creditCardNumber + " is invalid ");
        }

    }


    public static boolean isValid(long number) {

        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String str = convertNumberToString(number);
        int total = 0;

        for (int i = str.length()-2; i >= 0; i -= 2) {

            int mm = str.charAt(i)-'0';

            if (mm * 2 < 10) {
                total +=mm*2;


            } else if (mm * 2 >= 10) {

                int a = mm * 2 % 10;
                int b = mm * 2 / 10;
                total += (a + b);

            }

        }

        return total;
    }

    public static String convertNumberToString(long number) {
        return number + "";


    }

    public static int sumOfOddPlace(long number) {
        String str = convertNumberToString(number);
        int total = 0;
        for (int i = str.length()-1; i >=0; i -= 2) {
            total += (str.charAt(i)-'0');

        }

        return total;

    }

    public static long getPrefix(long number, int k) {

        String str = convertNumberToString(number);

        if (str.length() <= k) {
            return getSize(number);
        }
        return -1;
    }


    public static int getSize(long number){

return convertNumberToString(number).length();

    }

}




