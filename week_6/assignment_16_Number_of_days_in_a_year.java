package week_6;

import java.util.Scanner;

//Write a method that returns the number of days in a year using
//the following header:
public class assignment_16_Number_of_days_in_a_year {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        int year = write();
        int lastYear = lastYear();
        System.out.printf("%-10s %s %n", "Year", "Days in year");

        for (int i = year; i <= lastYear; i++) {

            System.out.printf("%-15d %d%n", i, numberOfDaysInAYear(i));

        }


    }

    public static int numberOfDaysInAYear(int year) {

        if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
            return 366;
        }

        return 365;
    }

    public static int write() {

        System.out.println("Enter the year : ");


        return input.nextInt();
    }

    public static int lastYear() {
        System.out.println("Enter the last year");
        return input.nextInt();
    }

}
