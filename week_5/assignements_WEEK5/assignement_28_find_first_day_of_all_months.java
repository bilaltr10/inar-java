package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Display the �rst days of each month) Write a program that prompts the user to enter the
//year and �rst day of the year, and displays the �rst day of each month in the year. For
//example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program
//should display the following output:
//January 1, 2013 is Tuesday
//...
//December 1, 2013 is Sunday
public class assignement_28_find_first_day_of_all_months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = input.nextInt();
        System.out.print("Enter first day of year : ");
        int day = input.nextInt();


        for (int i = 1; i <= 12; i++) {

            switch (i) {
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6:
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                case 12:
                    System.out.print("December");
                    break;
           }
            System.out.print(" 1 ,  " + year + " is :");
            switch (i) {
                case 1:
                    day = day;
                    break;
                case 2:
                    day += 31;
                    break;
                case 3:
                    if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
                        day += 29;
                    } else {
                        day += 28;
                    }
                    break;
                case 4:
                    day += 31;
                    break;
                case 5:
                    day += 30;
                    break;
                case 6:
                    day += 31;
                    break;
                case 7:
                    day += 30;
                    break;
                case 8:
                    day += 31;
                    break;
                case 9:
                    day += 31;
                    break;
                case 10:
                    day += 30;
                    break;
                case 11:
                    day += 31;
                    break;
                case 12:
                    day += 30;
                    break;
            }

            day %= 7;

            switch (day) {
                case 0:
                    System.out.println(" Sunday ");
                    break;
                case 1:
                    System.out.println(" Monday ");
                    break;
                case 2:
                    System.out.println(" Tuesday");
                    break;
                case 3:
                    System.out.println(" Wednesday");
                    break;
                case 4:
                    System.out.println(" Thursday");
                    break;
                case 5:
                    System.out.println(" Friday");
                    break;
                case 6:
                    System.out.println(" Saturday");
                    break;
            }
            System.out.println();
        }


    }
}
