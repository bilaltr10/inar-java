package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_36_books_10_numbered_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberTharUserEntered = 0;
        int totalOfNineNumber = 0;
        String writeTheNumberEntered = "";
        int count = 1;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " . sayıyı gir :");
            numberTharUserEntered = input.nextInt();
            totalOfNineNumber += numberTharUserEntered*i;
            writeTheNumberEntered += numberTharUserEntered + "";

        }
        if (totalOfNineNumber % 11 == 10) {
            System.out.println(writeTheNumberEntered.concat("X"));
        } else {
            System.out.println(writeTheNumberEntered + "" + totalOfNineNumber % 11);
        }

    }
}
