package week_5.assignements_WEEK5;

import java.util.Locale;
import java.util.Scanner;

//(Longest common prefix) Write a program that prompts the user to enter two strings and
//displays the largest common prefix of the two strings. Here are some sample runs
public class assignement_51_find_2_strings_have_prefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String firstString = input.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Enter the second string :");
        String secondString = input.nextLine().toUpperCase(Locale.ROOT);

        String commonPrefix ="";

        int min = Math.min(firstString.length(),secondString.length());

        for (int i=0 ; i<min; i++){

            if ( firstString.charAt(i)== secondString.charAt(i)){

                commonPrefix +=firstString.charAt(i);
            }
            else {
                break;
            }


        }

        if (commonPrefix.isEmpty()){
            System.out.println(firstString +" and "+ secondString+ " have no common prefix");
        }
else {
            System.out.println("The common prefix is "+ commonPrefix);

        }
    }
}
