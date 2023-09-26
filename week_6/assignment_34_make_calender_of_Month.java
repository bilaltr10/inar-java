package week_6;

import java.util.Scanner;

public class assignment_34_make_calender_of_Month {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter the month : ");
        int month = numberOfMonth();

        int dayOfMonth = dayOfMonth(month, year);

        int century = century(year);
        int yearOfTheCentury = yearOfTheCentury(year);


        int dayOfWeek = findTheDay(month, dayOfMonth, century, yearOfTheCentury);


        writeTheCalender(dayOfWeek, namesOfMonths(month), year, dayOfMonth);
    }

    public static int findTheDay(int month, int dayOfTheMonth, int century, int yearOfTheCentury) {
        System.out.println(month);
        System.out.println(dayOfTheMonth);
        System.out.println(century);
        System.out.println(yearOfTheCentury);
        return ((dayOfTheMonth + ((26 * (month +1)) / 10) + yearOfTheCentury + (yearOfTheCentury / 4) + (century / 4) + (5 * century)) % 7);

    }

    public static int dayOfMonth(int month, int year) {
        if (month == 13) {
            month = 1;
        }
        if (month == 14) {
            month = 2;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if (month == 2) {
            if ((year % 4 == 0 && !(year % 100 == 0)) || year == 400) {
                return 29;
            } else {
                return 28;
            }
        }
        else {
            return 30;
        }


    }

    public static int numberOfMonth() {
        int numberOfMonth = input.nextInt();

        if (numberOfMonth == 1) {
            return 13;
        }
        if (numberOfMonth == 2) {
            return 14;
        } else {
            return numberOfMonth;
        }
    }

    public static int century(int year) {

        return (year / 100) ;
    }

    public static int yearOfTheCentury(int year) {
        return year % 100;
    }

    public static String namesOfMonths(int month) {


        return switch (month) {
            case 13 -> "January";
            case 14 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "cxc";
        };
    }

    public static void writeTheCalender(int dayOfWeek, String nameOfMonth, int year, int daysOfMonth) {

        System.out.println(dayOfWeek);
        System.out.println("           " + nameOfMonth + "  " + year);
        System.out.println("--------------------------------");
        System.out.println("SAT  SUN  MON  THE  WED  THU  FRI  ");

        for (int i = 1; i <= daysOfMonth; i++) {
            if (i == 1) {
                makeSpaces(dayOfWeek);
            }
            System.out.printf("%-5d", i);


            dayOfWeek++;
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
        }
    }


    public static void makeSpaces(int dayOfWeek) {

        if (dayOfWeek % 7 == 0) {
            System.out.printf("%-1s ", " ");
        }
        if (dayOfWeek % 7 == 1) {
            System.out.printf("%-4s ", " ");
        }
        if (dayOfWeek % 7 == 2) {
            System.out.printf("%-9s ", " ");

        }
        if (dayOfWeek % 7 == 3) {
            System.out.printf("%-14s ", " ");
        }
        if (dayOfWeek % 7 == 4) {
            System.out.printf("%-19s ", " ");

        }
        if (dayOfWeek % 7 == 5) {
            System.out.printf("%-24s ", " ");
        }
        if (dayOfWeek % 7 == 6) {
            System.out.printf("%-29s ", " ");
        }
    }

}

