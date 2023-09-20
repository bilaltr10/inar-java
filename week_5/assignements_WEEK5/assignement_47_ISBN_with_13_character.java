package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_47_ISBN_with_13_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int checkSum = 0;


        System.out.print("Enter the first 12 digits of an ISBN-13 as a string :");
        String isbnNumber = input.next();

        if (isbnNumber.length() < 12) {
            System.out.println(isbnNumber + "is an invalid input");
        }

        else {
            for (int i = 1; i <= isbnNumber.length() ; i++) {

                int number = Integer.parseInt(String.valueOf(isbnNumber.charAt(i-1)));
                if (i % 2 == 0) {
                    total += (number * 3);
                } else {
                    total += number;
                }

            }
            checkSum = 10 - total % 10;
            String newIsbn = (checkSum == 10) ? isbnNumber + "0" : isbnNumber + checkSum;

            System.out.println("The ISBN-13 number is " + newIsbn);
        }
    }
}
