package week_5.assignements_WEEK5;

import java.util.Scanner;

//Write a program that prompts the user to enter a string and displays the
//string in reverse order.
public class assignement_46_reverse_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string :");
        String stringOfUser = input.nextLine();
        String reversedVersionOfStringOfUser = "";

        int lengthOfString = stringOfUser.length();


        for (int i = lengthOfString-1; i >= 0; i--) {

            char x = stringOfUser.charAt(i);

            reversedVersionOfStringOfUser += x;


        }
        System.out.println(reversedVersionOfStringOfUser);
    }
}
