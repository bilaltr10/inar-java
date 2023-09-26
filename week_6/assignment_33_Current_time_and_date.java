package week_6;

import java.util.Scanner;

public class assignment_33_Current_time_and_date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long milliSec = System.currentTimeMillis();

        int sec = sec(milliSec);
        int min = min(milliSec);
        int hour = hour(milliSec) + 3;
        System.out.print("Current time and date is : ");
        System.out.print(((hour % 12 < 10) ? "0" + (hour % 12) : hour % 12) + "/" + (min % 60 < 10 ? "0" + min % 60 : min % 60) + "/" +
                (sec % 60 < 10 ? "0" + sec % 60 : sec % 60) + " " + ((hour > 12) ? "PM " : "AM "));

        int year = year(milliSec);
    }

    public static int sec(long time) {
        return totalSec(time) % 60;

    }

    public static int totalSec(long time) {

        return (int) (time / 1000);
    }

    public static int min(long time) {
        return totalMin(time) % 60;

    }

    public static int totalMin(long time) {
        return totalSec(time) / 60;

    }

    public static int hour(long time) {
        return totalHour(time) % 24;

    }

    public static int totalHour(long time) {
        return totalMin(time) / 60;
    }

    public static int year(long time) {
        int days = totalDay(time);
        int year = 1970;
        int count = 1;
        while (days > 365) {

            if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {

                days -= 366;
            } else {
                days -= 365;
            }
            year++;
        }

        month(days, year);
        return year;
    }


    public static int totalDay(long time) {
        return totalHour(time) / 24;

    }

    public static void month(int days, int year) {
        int month = 1;
        while (days > 27) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

                days -= 31;
                month++;
            }
            if (month == 2) {

                if (((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0)) {
                    days -= 29;
                    month++;
                } else {
                    days -= 28;
                    month++;

                }
            } else {
                days -= 30;
                month++;
            }
        }
        System.out.print(month(month));
        System.out.print(" "+days);
        System.out.print(" , " + year);
    }

    public static String month(int month) {
        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";


        }


    return "sdc";
    }
}

