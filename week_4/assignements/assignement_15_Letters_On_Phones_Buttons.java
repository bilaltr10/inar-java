package week_4.assignements;

import java.util.*;
//The international standard letter/number mapping found on the
//telephone is shown below
//Write a program that prompts the user to enter a letter and displays its corresponding
//number

public class assignement_15_Letters_On_Phones_Buttons {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter a letter");
        String letter = bilal.next();
        char charOfletter = letter.charAt(0);

        int valueOfLetter = charOfletter - 65;
        int valueOfVowelLetter = charOfletter - 97;
        if (letter.equals("@") || letter.equals("_") || letter.equals(","))
            System.out.println("The corresponding number is 1");
       else if ((valueOfVowelLetter >= 0 && valueOfVowelLetter <= 2) || (valueOfLetter >= 0 && valueOfLetter <= 2))
            System.out.printf("The corresponding number is 2");
        else if ((valueOfVowelLetter >= 3 && valueOfVowelLetter <= 5) || (valueOfLetter >= 3 && valueOfLetter <= 5))
            System.out.printf("The corresponding number is 3");
        else if ((valueOfVowelLetter >= 6 && valueOfVowelLetter <= 8) || (valueOfLetter >= 6 && valueOfLetter <= 8))
            System.out.printf("The corresponding number is 4");
        else if ((valueOfVowelLetter >= 9 && valueOfVowelLetter <= 11) || (valueOfLetter >= 9 && valueOfLetter <= 11))
            System.out.printf("The corresponding number is 5");
        else if ((valueOfVowelLetter >= 12 && valueOfVowelLetter <= 14) || (valueOfLetter >= 12 && valueOfLetter <= 14))
            System.out.printf("The corresponding number is 6");
        else if ((valueOfVowelLetter >= 15 && valueOfVowelLetter <= 17) || (valueOfLetter >= 15 && valueOfLetter <= 17))
            System.out.printf("The corresponding number is 7");
        else if ((valueOfVowelLetter >= 18 && valueOfVowelLetter <= 20) || (valueOfLetter >= 18 && valueOfLetter <= 20))
            System.out.printf("The corresponding number is 8");
        else if ((valueOfVowelLetter >= 21 && valueOfVowelLetter <= 23) || (valueOfLetter >= 21 && valueOfLetter <= 23))
            System.out.printf("The corresponding number is 9");
        else System.out.println("Invalid value");
    }
}
