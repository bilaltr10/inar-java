package week_6;

import java.util.Scanner;

public class assignment_31_credit_card_number_check_NOT_YET {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer");
        long creditCardNumber = input.nextLong();



        if (isValid(creditCardNumber)) {

               System.out.println(creditCardNumber+ " is valid");
           }
            else{
               System.out.println(creditCardNumber+" is invalid ");
           }

        }


    public static boolean isValid(long number) {

      return (sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String str = convertNumberToString(number);
        int total = 0;
        for (int i = 1; i <= str.length(); i += 2) {

            if (str.charAt(i) * 2 < 10) {
                total += str.charAt(i);

            } else if (str.charAt(i) * 2 >= 10) {

                int a = str.charAt(i) * 2 % 10;
                int b = str.charAt(i) * 2 / 10;
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
        for (int i = 0; i < str.length(); i += 2) {

            total += str.charAt(i);
        }

        return total;

    }

   //** Return the �rst k number of digits from number. If the
   //* number of digits in number is less than k, return number. *
  /*  public static long getPrefix (long number , int k){

    }*/
















}



