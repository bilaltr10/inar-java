package week_3.assignements;
//(Find future dates) Write a program that prompts the user to enter an integer for
//today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also prompt the
//user to enter the number of days after today for a future day and display the future day of
//the week. Here is a sample run

import java.util.*;
// tek switch ile yapsak iyi olmaz mı???
public class assignement_5 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter the today's day");
        int today = bilal.nextInt();
        switch (today) {

            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;


        }
        System.out.println("how many days later ");
        int dayLater = bilal.nextInt();
        today = (today + dayLater) % 6;
        switch (today) {

            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;

        }
    }
}
