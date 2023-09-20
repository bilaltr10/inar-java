package week_5.assignements_WEEK5;

import java.util.Locale;
import java.util.Scanner;

//Assume letters A, E, I, O, and U as the vowels. Write a
//program that prompts the user to enter a string and displays the number of vowels and
//consonants in the string.
public class assignement_49_count_vowels_and_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string :");
        String inputOfUser = input.nextLine().toUpperCase(Locale.ROOT);


        int countOfVowel = 0;
        int countOfConsonant = 0;

        for (int i = 0; i < inputOfUser.length(); i++) {

            if (inputOfUser.charAt(i) >= 'A' && inputOfUser.charAt(i) <= 'Z') {
                if (inputOfUser.charAt(i) == 'A' || inputOfUser.charAt(i) == 'E' || inputOfUser.charAt(i) == 'I'
                        || inputOfUser.charAt(i) == 'O' || inputOfUser.charAt(i) == 'U') {
                    countOfVowel++;
                } else {
                    countOfConsonant++;
                }

            }

        }
        System.out.println("The number of vowels : "+ countOfVowel);
        System.out.println("The number of consonant : "+ countOfConsonant);
    }
}