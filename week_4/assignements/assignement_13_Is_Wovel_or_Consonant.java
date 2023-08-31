package week_4.assignements;
import java.util.*;
//(Vowel or consonant?) Write a program that prompts the user to enter a letter and check
//whether the letter is a vowel or consonant

public class assignement_13_Is_Wovel_or_Consonant {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter = bilal.next();

        char charOfLetter=letter.charAt(0);
//
       // int valueOfLetter = charOfLetter;

        if (charOfLetter>=65 && charOfLetter<= 90){
            System.out.printf("%s is a consonant ",letter);
        }
        else if (charOfLetter>=97 &&  charOfLetter<=122){
            System.out.printf("%s is a vowel ", letter);
        }
else{
            System.out.println("You entered an invalid value");
        }
    }
}
