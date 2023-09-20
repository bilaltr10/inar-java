package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Display calendars) Write a program that prompts the user to enter the year and �rst day of
//the year and displays the calendar table for the year on the console. For example, if the user
//entered the year 2013, and 2 for Tuesday, January 1, 2013, your program should display the
//calendar for each month in the year, as follows:
public class assignement_29_make_calender_of_all_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the year: ");
        int year = input.nextInt();
        System.out.print("enter the first day of year :");
        int day = input.nextInt();
        int gün_sayısı = 0;
        int counter = 0;
        int başlama = 0;
        for (int i = 1; i <= 12; i++) {

            switch (i) {
                case 1 -> System.out.print("January");
                case 2 -> System.out.print("February");
                case 3 -> System.out.print("March");
                case 4 -> System.out.print("April");
                case 5 -> System.out.print("May");
                case 6 -> System.out.print("June");
                case 7 -> System.out.print("July");
                case 8 -> System.out.print("August");
                case 9 -> System.out.print("September");
                case 10 -> System.out.print("October");
                case 11 -> System.out.print("November");
                case 12 -> System.out.print("December");
            }

            System.out.println("  " + year);
            System.out.println("---------------------------------------");
            System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %-5s ", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
            System.out.println();

            switch (i) {
                case 1:
                    day = day;
                    gün_sayısı = 31;
                    break;
                case 2:
                    if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
                        gün_sayısı = 29;
                    } else {
                        gün_sayısı = 28;
                    }
                    day += 31;
                    break;
                case 3:
                    gün_sayısı = 31;
                    if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
                        day += 29;
                    } else {
                        day += 28;
                    }
                    break;
                case 4:
                    day += 31;
                    gün_sayısı = 30;
                    break;
                case 5:
                    day += 30;
                    gün_sayısı = 31;
                    break;

                case 6:
                    day += 31;
                    gün_sayısı = 30;
                    break;
                case 7:
                    day += 30;
                    gün_sayısı = 31;
                    break;
                case 8:
                    day += 31;
                    gün_sayısı = 31;
                    break;
                case 9:
                    day += 31;
                    gün_sayısı = 30;
                    break;
                case 10:
                    day += 30;
                    gün_sayısı = 31;
                    break;
                case 11:
                    gün_sayısı = 30;
                    day += 31;
                    break;
                case 12:
                    gün_sayısı = 30;
                    day += 30;
                    break;
            }

           day %= 7;
            başlama =day;
            switch (başlama) {

                case 0:
                    System.out.printf("%s","");

                    break;
                case 1:
                    System.out.printf("%-7s","");
                    break;
                case 2:
                    System.out.printf("%-12s"," ");
                    break;
                case 3:
                    System.out.printf("%-19s"," ");
                    break;
                case 4:
                    System.out.printf("%-24s"," ");
                    break;
                case 5:
                    System.out.printf("%-30s"," ");
                    break;
                case 6:
                    System.out.printf("%-36s"," ");
                    break;


            }


            for (counter = 1; counter <= gün_sayısı; counter++) {

                System.out.printf("%-6d", counter);
                başlama++;

                if (başlama % 7 == 0) System.out.println();

            }
            System.out.println();

        }

    }
}
