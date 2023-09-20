package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Count uppercase letters) Write a program that prompts the user to enter a string and
//displays the number of the uppercase letters in the string
public class assignement_50_number_of_uppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a string :");
        String inputOfUser = input.nextLine();

int countOfUpperCase=0;


        for (int i = 0; i < inputOfUser.length(); i++) {

            if ((inputOfUser.charAt(i) >= 'A' && inputOfUser.charAt(i) <= 'Z')  ) {
            countOfUpperCase++;

            }
        }
        System.out.println("The number of uppercase letters : "+ countOfUpperCase);
    }
}
