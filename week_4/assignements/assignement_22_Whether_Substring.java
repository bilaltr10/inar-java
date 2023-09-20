package week_4.assignements;
import java.util.*;
//(Check substring) Write a program that prompts the user to enter two strings and reports
//whether the second string is a substring of the �rst strin

public class assignement_22_Whether_Substring {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.print("enter the first word : ");
        String firstWord = bilal.nextLine();
        System.out.print("Enter the second word : ");
        String secondWord = bilal.nextLine();

        if (firstWord.length()>secondWord.length()){
            boolean isSubstring = firstWord.contains(secondWord);
            if(isSubstring) System.out.println("Second word is substring of the first one.");
else System.out.println("Second word is not substring of the first one");
        }
else if (secondWord.length()>firstWord.length()){
            boolean isSubstring = secondWord.contains(firstWord);
            if(isSubstring) System.out.println("First word is substring of the second one.");
            else System.out.println("First word is not substring of the second one");

        }
else System.out.println("First word has same length of second one so there is not case of substring");
    }
}
