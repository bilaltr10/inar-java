package week_6;

import java.util.Scanner;

public class assignment_25_Convert_milliseconds_to_hours_minutes_and_seconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds : ");
        long milliSec = input.nextLong();
        System.out.println("hours : minutes : seconds : " + convertMillis(milliSec));
    }

    public static String convertMillis(long millis) {

        int totalSec = (int) (millis / 1000);
        int sec = totalSec % 60;
        int min = 0;
        int hour = 0;

        while (totalSec > sec) {

            totalSec -= 60;
            min++;
            if (min % 60 == 0) {
                hour++;
                min = 0;
            }

        }


        return hour + "/" + min + "/" + sec;
    }
}
