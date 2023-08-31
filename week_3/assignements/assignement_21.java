package week_3.assignements;

import java.util.*;
//Write a program
//that prompts the user to enter a year, month, and day of the month, and
// displays the name of the day of the week

public class assignement_21 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = bilal.nextInt();
        System.out.println("Enter the month ");
        int month = bilal.nextInt();
        System.out.println("Enter the day of month");
        int dayOfMonth = bilal.nextInt();
        int yearOfTheCentury = year % 100;
        int century = year / 100;

        switch (month) {
            case 1:
                month = 13;
                break;
            case 2:
                month = 14;
                break;
            case 3:
                month = 3;
                break;
            case 4:
                month = 4;
                break;
            case 5:
                month = 5;
                break;
            case 6:
                month = 6;
                break;
            case 7:
                month = 7;
                break;
            case 8:
                month = 8;
                break;
            case 9:
                month = 9;
                break;
            case 10:
                month = 10;
                break;
            case 11:
                month = 11;
                break;
            case 12:
                month = 12;
                break;
        }

        int daysOfWeek = ((dayOfMonth + ((26 * (month + 1)) / 10) + (yearOfTheCentury) + (yearOfTheCentury / 4) + (century / 4) + (5 * century)) % 7);


        if (month == 13) month = 1;
        if (month == 14) month = 2;
        switch (daysOfWeek) {
            case 0:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is SATURDAY ");break ;
            case 1:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is SUNDAY ");break ;
            case 2:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is MONDAY ");break ;
            case 3:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is THUESDAY ");break ;
            case 4:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is WEDNASDAY ");break ;
            case 5:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is THURSDAY ");break ;
            case 6:
                System.out.println(dayOfMonth + " / " + month + " / " + year + " is FRİDAY ");break ;

        }

    }
}
