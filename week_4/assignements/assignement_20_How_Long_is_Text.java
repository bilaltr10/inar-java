package week_4.assignements;
import java.util.*;
//) Write a program that prompts the user to enter a string and dis- plays its
//length and its �rst character
public class assignement_20_How_Long_is_Text {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter anything you like");
        String inputFromUser = bilal.nextLine();

        System.out.printf("The lenght of %s is :  %d\nThe first letter of %s is %c ", inputFromUser,inputFromUser.length(),inputFromUser,inputFromUser.charAt(0));



    }
}


